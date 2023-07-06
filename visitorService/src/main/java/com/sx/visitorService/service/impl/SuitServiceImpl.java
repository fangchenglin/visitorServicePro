package com.sx.visitorService.service.impl;

import com.sx.visitorService.DTO.SuitDTO;
import com.sx.visitorService.entity.Person;
import com.sx.visitorService.entity.Suit;
import com.sx.visitorService.dao.SuitDao;
import com.sx.visitorService.service.SuitService;
import com.sx.visitorService.utils.result.DataResult;
import com.sx.visitorService.utils.result.code.Code;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * (Suit)表服务实现类
 *
 * @author makejava
 * @since 2023-07-05 12:02:38
 */
@Service("suitService")
public class SuitServiceImpl implements SuitService {
    @Resource
    private SuitDao suitDao;

    @Resource
    HttpSession session;

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    @Override
    public Suit queryById(Integer sId) {
        return this.suitDao.queryById(sId);
    }

    /**
     * 分页查询
     *
     * @param suitDTO 筛选条件
     * @param   
     * @return 查询结果
     */
    @Override
    public DataResult queryByPage(SuitDTO suitDTO) {
        long total = this.suitDao.count(suitDTO);
        List<Suit> suits = this.suitDao.queryAllByLimit(suitDTO);
        return DataResult.successByTotalData(suits,total);
    }

    /**
     * 新增数据
     *
     * @param suit 实例对象
     * @return 实例对象
     */
    @Override
    public Suit insert(Suit suit) {
        this.suitDao.insert(suit);
        return suit;
    }

    /**
     * 修改数据
     *
     * @param suit 实例对象
     * @return 实例对象
     */
    @Override
    public Suit update(Suit suit) {
        this.suitDao.update(suit);
        return this.queryById(suit.getSId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sId) {
        return this.suitDao.deleteById(sId) > 0;
    }

    @Override
    public DataResult deal(Suit suit) {
        int insert_suit = suitDao.insert(suit);
        return DataResult.successByData(suit);
    }

    //提交表单
    @Override
    public DataResult suit(Suit suit){
        int insert_suit = suitDao.insert(suit);
        return DataResult.successByData(suit);
    }



}
