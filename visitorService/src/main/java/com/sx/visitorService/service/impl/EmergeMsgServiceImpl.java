package com.sx.visitorService.service.impl;

import com.sx.visitorService.DTO.EmergeMsgDTO;
import com.sx.visitorService.DTO.EmergeMsgWithName;
import com.sx.visitorService.DTO.suitWithName;
import com.sx.visitorService.dao.PersonDao;
import com.sx.visitorService.entity.EmergeMsg;
import com.sx.visitorService.dao.EmergeMsgDao;
import com.sx.visitorService.entity.Person;
import com.sx.visitorService.entity.Suit;
import com.sx.visitorService.service.EmergeMsgService;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (EmergeMsg)表服务实现类
 *
 * @author makejava
 * @since 2023-07-05 12:01:41
 */
@Service("emergeMsgService")
public class EmergeMsgServiceImpl implements EmergeMsgService {
    @Resource
    private EmergeMsgDao emergeMsgDao;
    @Resource
    private PersonDao personDao;
    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    @Override
    public EmergeMsg queryById(Integer mId) {
        return this.emergeMsgDao.queryById(mId);
    }

    @Override
    public DataResult queryByPage(EmergeMsgDTO emergeMsgDTO) {
        long total = this.emergeMsgDao.count(emergeMsgDTO);
        List<EmergeMsg> EmergeMsgs = this.emergeMsgDao.queryAllByLimit(emergeMsgDTO);
        List<EmergeMsgWithName> emergeMsgWithNames =new ArrayList<>();
        for(EmergeMsg i:EmergeMsgs){

            Person publish=personDao.queryById(i.getPublishId());
            Person examine = personDao.queryById(i.getExamineId());
            EmergeMsgWithName j= new EmergeMsgWithName();
            BeanUtils.copyProperties(i,j);
            if(examine!=null){
                j.setExamineName(examine.getPersonName());
            }

            j.setPublishName(publish.getPersonName());
            emergeMsgWithNames.add(j);
        }
        return DataResult.successByTotalData(emergeMsgWithNames,total);
    }


    /**
     * 新增数据
     *
     * @param emergeMsg 实例对象
     * @return 实例对象
     */
    @Override
    public EmergeMsg insert(EmergeMsg emergeMsg) {
        this.emergeMsgDao.insert(emergeMsg);
        return emergeMsg;
    }

    /**
     * 修改数据
     *
     * @param emergeMsg 实例对象
     * @return 实例对象
     */
    @Override
    public EmergeMsg update(EmergeMsg emergeMsg) {
        this.emergeMsgDao.update(emergeMsg);
        return this.queryById(emergeMsg.getEmergeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mId) {
        return this.emergeMsgDao.deleteById(mId) > 0;
    }

    @Override
    public DataResult publish(EmergeMsg emergeMsg) {
        int insert_suit = emergeMsgDao.insert(emergeMsg);
        return DataResult.successByData(emergeMsg);    }
}
