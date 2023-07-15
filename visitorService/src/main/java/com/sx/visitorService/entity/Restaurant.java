package com.sx.visitorService.entity;

import java.io.Serializable;

/**
 * (Restaurant)实体类
 *
 * @author makejava
 * @since 2023-07-13 09:53:14
 */
public class Restaurant implements Serializable {
    private static final long serialVersionUID = 318761936864773427L;
    
    private Integer restaurantId;
    
    private String restaurantName;
    
    private String restaurantPhone;
    
    private String restaurantSite;
    
    private String restaurantType;

    private String restaurantPicture;


    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantPhone() {
        return restaurantPhone;
    }

    public void setRestaurantPhone(String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }

    public String getRestaurantSite() {
        return restaurantSite;
    }

    public void setRestaurantSite(String restaurantSite) {
        this.restaurantSite = restaurantSite;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public String getRestaurantPicture() {
        return restaurantPicture;
    }

    public void setRestaurantPicture(String restaurantPicture) {
        this.restaurantPicture = restaurantPicture;
    }
}

