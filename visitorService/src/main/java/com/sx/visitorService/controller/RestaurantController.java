package com.sx.visitorService.controller;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.RestaurantDTO;
import com.sx.visitorService.entity.Restaurant;
import com.sx.visitorService.service.RestaurantService;
import com.sx.visitorService.utils.PageUtil;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Restaurant)表控制层
 *
 * @author makejava
 * @since 2023-07-13 09:53:14
 */
@RestController
@RequestMapping("restaurant")
public class RestaurantController {
    /**
     * 服务对象
     */
    @Resource
    private RestaurantService restaurantService;

    /**
     * 分页查询
     *
     * @param restaurant 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @PostMapping("listRestaurant")
    public DataResult queryByPage(@RequestBody RestaurantDTO restaurantDTO) {
        Long page = restaurantDTO.getPage();
        Long limit = restaurantDTO.getLimit();
        Long startPage = PageUtil.getStartPage(page, limit);
        restaurantDTO.setPage(startPage);
        DataResult dataResult = this.restaurantService.queryByPage(restaurantDTO);
        return dataResult;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Restaurant> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.restaurantService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param restaurant 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Restaurant> add(Restaurant restaurant) {
        return ResponseEntity.ok(this.restaurantService.insert(restaurant));
    }

    /**
     * 编辑数据
     *
     * @param restaurant 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Restaurant> edit(Restaurant restaurant) {
        return ResponseEntity.ok(this.restaurantService.update(restaurant));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.restaurantService.deleteById(id));
    }

}

