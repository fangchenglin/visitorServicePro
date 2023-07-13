package com.sx.visitorService.service;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.PerformingDTO;
import com.sx.visitorService.entity.Performing;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Performing)表服务接口
 *
 * @author makejava
 * @since 2023-07-13 09:54:12
 */
public interface PerformingService {

    /**
     * 通过ID查询单条数据
     *
     * @param performingId 主键
     * @return 实例对象
     */
    Performing queryById(Integer performingId);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    DataResult queryByPage(PerformingDTO performingDTO);

    /**
     * 新增数据
     *
     * @param performing 实例对象
     * @return 实例对象
     */
    Performing insert(Performing performing);

    /**
     * 修改数据
     *
     * @param performing 实例对象
     * @return 实例对象
     */
    Performing update(Performing performing);

    /**
     * 通过主键删除数据
     *
     * @param performingId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer performingId);

}
