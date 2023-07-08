package com.sx.visitorService.entity;

import java.io.Serializable;

/**
 * (Room)实体类
 *
 * @author makejava
 * @since 2023-07-07 14:41:22
 */
public class Room implements Serializable {
    private static final long serialVersionUID = 394139169586428561L;
    
    private Integer roomId;
    
    private Integer capacity;
    
    private Integer state;
    
    private Integer personId;
    
    private Integer price;
    
    private Integer hotelId;
    
    private Integer roomNumber;


    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

}

