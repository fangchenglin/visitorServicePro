package com.sx.visitorService.service.impl;

import com.sx.visitorService.entity.EmergeMsg;
import com.sx.visitorService.dao.EmergeMsgDao;
import com.sx.visitorService.service.EmergeMsgService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

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

    /**
     * 分页查询
     *
     * @param emergeMsg 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<EmergeMsg> queryByPage(EmergeMsg emergeMsg, PageRequest pageRequest) {
        long total = this.emergeMsgDao.count(emergeMsg);
        return new PageImpl<>(this.emergeMsgDao.queryAllByLimit(emergeMsg, pageRequest), pageRequest, total);
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
        return this.queryById(emergeMsg.getMId());
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
}
