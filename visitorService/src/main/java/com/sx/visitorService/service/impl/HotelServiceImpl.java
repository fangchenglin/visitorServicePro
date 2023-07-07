package com.sx.visitorService.service.impl;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.suitWithName;
import com.sx.visitorService.entity.Hotel;
import com.sx.visitorService.dao.HotelDao;
import com.sx.visitorService.entity.Person;
import com.sx.visitorService.entity.Suit;
import com.sx.visitorService.service.HotelService;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Hotel)表服务实现类
 *
 * @author makejava
 * @since 2023-07-05 12:01:55
 */
@Service("hotelService")
public class HotelServiceImpl implements HotelService {
    @Resource
    private HotelDao hotelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hId 主键
     * @return 实例对象
     */
    @Override
    public Hotel queryById(Integer hId) {
        return this.hotelDao.queryById(hId);
    }

    @Override
    public DataResult queryByPage(HotelDTO hotelDTO) {
        long total = this.hotelDao.count(hotelDTO);
        List<Hotel> hotels = this.hotelDao.queryAllByLimit(hotelDTO);

        return DataResult.successByTotalData(hotels,total);    }


    /**
     * 新增数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    @Override
    public Hotel insert(Hotel hotel) {
        this.hotelDao.insert(hotel);
        return hotel;
    }

    /**
     * 修改数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    @Override
    public Hotel update(Hotel hotel) {
        this.hotelDao.update(hotel);
        return this.queryById(hotel.getHId());
    }

    /**
     * 通过主键删除数据
     *
     * @param hId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer hId) {
        return this.hotelDao.deleteById(hId) > 0;
    }
}
