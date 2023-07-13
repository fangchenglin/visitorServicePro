package com.sx.visitorService.service.impl;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.PerformingDTO;
import com.sx.visitorService.entity.Hotel;
import com.sx.visitorService.entity.Performing;
import com.sx.visitorService.dao.PerformingDao;
import com.sx.visitorService.service.PerformingService;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Performing)表服务实现类
 *
 * @author makejava
 * @since 2023-07-13 09:54:12
 */
@Service("performingService")
public class PerformingServiceImpl implements PerformingService {
    @Resource
    private PerformingDao performingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param performingId 主键
     * @return 实例对象
     */
    @Override
    public Performing queryById(Integer performingId) {
        return this.performingDao.queryById(performingId);
    }

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @Override
    public DataResult queryByPage(PerformingDTO performingDTO) {
        long total = this.performingDao.count(performingDTO);
        List<Performing> performings = this.performingDao.queryAllByLimit(performingDTO);
        return DataResult.successByTotalData(performings,total);    }

    /**
     * 新增数据
     *
     * @param performing 实例对象
     * @return 实例对象
     */
    @Override
    public Performing insert(Performing performing) {
        this.performingDao.insert(performing);
        return performing;
    }

    /**
     * 修改数据
     *
     * @param performing 实例对象
     * @return 实例对象
     */
    @Override
    public Performing update(Performing performing) {
        this.performingDao.update(performing);
        return this.queryById(performing.getPerformingId());
    }

    /**
     * 通过主键删除数据
     *
     * @param performingId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer performingId) {
        return this.performingDao.deleteById(performingId) > 0;
    }
}
