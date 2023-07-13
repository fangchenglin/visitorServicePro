package com.sx.visitorService.entity;

import java.io.Serializable;

/**
 * (Performing)实体类
 *
 * @author makejava
 * @since 2023-07-13 09:54:12
 */
public class Performing implements Serializable {
    private static final long serialVersionUID = -27198866612405116L;
    
    private Integer performingId;
    
    private String performingName;
    
    private String performingSite;
    
    private String performingTime;
    
    private String performingPhone;
    
    private String performingContext;


    public Integer getPerformingId() {
        return performingId;
    }

    public void setPerformingId(Integer performingId) {
        this.performingId = performingId;
    }

    public String getPerformingName() {
        return performingName;
    }

    public void setPerformingName(String performingName) {
        this.performingName = performingName;
    }

    public String getPerformingSite() {
        return performingSite;
    }

    public void setPerformingSite(String performingSite) {
        this.performingSite = performingSite;
    }

    public String getPerformingTime() {
        return performingTime;
    }

    public void setPerformingTime(String performingTime) {
        this.performingTime = performingTime;
    }

    public String getPerformingPhone() {
        return performingPhone;
    }

    public void setPerformingPhone(String performingPhone) {
        this.performingPhone = performingPhone;
    }

    public String getPerformingContext() {
        return performingContext;
    }

    public void setPerformingContext(String performingContext) {
        this.performingContext = performingContext;
    }

}

