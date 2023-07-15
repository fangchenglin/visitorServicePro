package com.sx.visitorService.service;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.RestaurantDTO;
import com.sx.visitorService.entity.Restaurant;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Restaurant)表服务接口
 *
 * @author makejava
 * @since 2023-07-13 09:53:14
 */
public interface RestaurantService {

    /**
     * 通过ID查询单条数据
     *
     * @param restaurantId 主键
     * @return 实例对象
     */
    Restaurant queryById(Integer restaurantId);

    /**
     * 分页查询
     *
     * @param restaurant 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    DataResult queryByPage(RestaurantDTO restaurantDTO);

    /**
     * 新增数据
     *
     * @param restaurant 实例对象
     * @return 实例对象
     */
    Restaurant insert(Restaurant restaurant);

    /**
     * 修改数据
     *
     * @param restaurant 实例对象
     * @return 实例对象
     */
    Restaurant update(Restaurant restaurant);

    /**
     * 通过主键删除数据
     *
     * @param restaurantId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer restaurantId);

}
