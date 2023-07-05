package com.sx.visitorService.service;

import com.sx.visitorService.entity.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Hotel)表服务接口
 *
 * @author makejava
 * @since 2023-07-05 12:01:55
 */
public interface HotelService {

    /**
     * 通过ID查询单条数据
     *
     * @param hId 主键
     * @return 实例对象
     */
    Hotel queryById(Integer hId);

    /**
     * 分页查询
     *
     * @param hotel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Hotel> queryByPage(Hotel hotel, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    Hotel insert(Hotel hotel);

    /**
     * 修改数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    Hotel update(Hotel hotel);

    /**
     * 通过主键删除数据
     *
     * @param hId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer hId);

}
