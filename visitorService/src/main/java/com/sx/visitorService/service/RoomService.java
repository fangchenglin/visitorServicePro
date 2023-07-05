package com.sx.visitorService.service;

import com.sx.visitorService.entity.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Room)表服务接口
 *
 * @author makejava
 * @since 2023-07-05 12:02:21
 */
public interface RoomService {

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    Room queryById(Integer rId);

    /**
     * 分页查询
     *
     * @param room 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Room> queryByPage(Room room, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param room 实例对象
     * @return 实例对象
     */
    Room insert(Room room);

    /**
     * 修改数据
     *
     * @param room 实例对象
     * @return 实例对象
     */
    Room update(Room room);

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rId);

}
