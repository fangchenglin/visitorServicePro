package com.sx.visitorService.dao;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.RestaurantDTO;
import com.sx.visitorService.entity.Restaurant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Restaurant)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-13 09:53:14
 */
@Mapper
public interface RestaurantDao {

    /**
     * 通过ID查询单条数据
     *
     * @param restaurantId 主键
     * @return 实例对象
     */
    Restaurant queryById(Integer restaurantId);

    /**
     * 查询指定行数
     * @return 对象列表
     */
    List<Restaurant> queryAllByLimit(RestaurantDTO restaurantDTO);

    /**
     * 统计总行数
     *
     * @param restaurant 查询条件
     * @return 总行数
     */
    long count(Restaurant restaurant);

    /**
     * 新增数据
     *
     * @param restaurant 实例对象
     * @return 影响行数
     */
    int insert(Restaurant restaurant);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Restaurant> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Restaurant> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Restaurant> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Restaurant> entities);

    /**
     * 修改数据
     *
     * @param restaurant 实例对象
     * @return 影响行数
     */
    int update(Restaurant restaurant);

    /**
     * 通过主键删除数据
     *
     * @param restaurantId 主键
     * @return 影响行数
     */
    int deleteById(Integer restaurantId);

}

