package com.sx.visitorService.entity;

import java.io.Serializable;

/**
 * (Room)实体类
 *
 * @author makejava
 * @since 2023-07-05 12:02:21
 */
public class Room implements Serializable {
    private static final long serialVersionUID = -40856249678167819L;
    
    private Integer roomId;
    
    private Integer capcity;
    
    private Integer state;
    
    private Integer personId;
    
    private Integer price;
    
    private Integer hotelId;


    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getCapcity() {
        return capcity;
    }

    public void setCapcity(Integer capcity) {
        this.capcity = capcity;
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

}

