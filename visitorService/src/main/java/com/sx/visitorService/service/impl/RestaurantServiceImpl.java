package com.sx.visitorService.service.impl;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.RestaurantDTO;
import com.sx.visitorService.entity.Hotel;
import com.sx.visitorService.entity.Restaurant;
import com.sx.visitorService.dao.RestaurantDao;
import com.sx.visitorService.service.RestaurantService;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Restaurant)表服务实现类
 *
 * @author makejava
 * @since 2023-07-13 09:53:14
 */
@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {
    @Resource
    private RestaurantDao restaurantDao;

    /**
     * 通过ID查询单条数据
     *
     * @param restaurantId 主键
     * @return 实例对象
     */
    @Override
    public Restaurant queryById(Integer restaurantId) {
        return this.restaurantDao.queryById(restaurantId);
    }

    /**
     * 分页查询
     * @return 查询结果
     */
    @Override
    public DataResult queryByPage(RestaurantDTO restaurantDTO) {
        long total = this.restaurantDao.count(restaurantDTO);
        List<Restaurant> restaurants = this.restaurantDao.queryAllByLimit(restaurantDTO);
        return DataResult.successByTotalData(restaurants,total);    }

    /**
     * 新增数据
     *
     * @param restaurant 实例对象
     * @return 实例对象
     */
    @Override
    public Restaurant insert(Restaurant restaurant) {
        this.restaurantDao.insert(restaurant);
        return restaurant;
    }

    /**
     * 修改数据
     *
     * @param restaurant 实例对象
     * @return 实例对象
     */
    @Override
    public Restaurant update(Restaurant restaurant) {
        this.restaurantDao.update(restaurant);
        return this.queryById(restaurant.getRestaurantId());
    }

    /**
     * 通过主键删除数据
     *
     * @param restaurantId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer restaurantId) {
        return this.restaurantDao.deleteById(restaurantId) > 0;
    }
}
