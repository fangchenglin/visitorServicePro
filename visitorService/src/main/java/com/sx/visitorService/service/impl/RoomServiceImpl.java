package com.sx.visitorService.service.impl;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.RoomDTO;
import com.sx.visitorService.entity.Hotel;
import com.sx.visitorService.entity.Room;
import com.sx.visitorService.dao.RoomDao;
import com.sx.visitorService.service.RoomService;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Room)表服务实现类
 *
 * @author makejava
 * @since 2023-07-07 14:41:22
 */
@Service("roomService")
public class RoomServiceImpl implements RoomService {
    @Resource
    private RoomDao roomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roomId 主键
     * @return 实例对象
     */
    @Override
    public Room queryById(Integer roomId) {
        return this.roomDao.queryById(roomId);
    }

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @Override
    public DataResult queryByPage(RoomDTO roomDTO) {
        long total = this.roomDao.count(roomDTO);
        List<Room> rooms = this.roomDao.queryAllByLimit(roomDTO);

        return DataResult.successByTotalData(rooms,total);    }
    /**
     * 新增数据
     *
     * @param room 实例对象
     * @return 实例对象
     */
    @Override
    public Room insert(Room room) {
        this.roomDao.insert(room);
        return room;
    }

    /**
     * 修改数据
     *
     * @param room 实例对象
     * @return 实例对象
     */
    @Override
    public Room update(Room room) {
        this.roomDao.update(room);
        return this.queryById(room.getRoomId());
    }

    /**
     * 通过主键删除数据
     *
     * @param roomId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer roomId) {
        return this.roomDao.deleteById(roomId) > 0;
    }

    @Override
    public DataResult count(Room room) {
        long total= roomDao.count(room);
        return  DataResult.successByDatas(total);
    }
}
