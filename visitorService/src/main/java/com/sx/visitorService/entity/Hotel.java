package com.sx.visitorService.entity;

import java.io.Serializable;

/**
 * (Hotel)实体类
 *
 * @author makejava
 * @since 2023-07-05 12:01:55
 */
public class Hotel implements Serializable {
    private static final long serialVersionUID = 818068113639864161L;
    
    private Integer hotelId;
    
    private String hotelName;
    
    private String hotelPhone;
    
    private String hotelSite;
    
    private Integer hotelClass;

    private String hotelPicture;

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hId) {
        this.hotelId = hId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hName) {
        this.hotelName = hName;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hPhone) {
        this.hotelPhone = hPhone;
    }

    public String getHotelSite() {
        return hotelSite;
    }

    public void setHotelSite(String hSite) {
        this.hotelSite = hSite;
    }

    public Integer getHotelClass() {
        return hotelClass;
    }

    public void setHotelClass(Integer hClass) {
        this.hotelClass = hClass;
    }

    public String getHotelPicture() {
        return hotelPicture;
    }

    public void setHotelPicture(String hotelPicture) {
        this.hotelPicture = hotelPicture;
    }
}

