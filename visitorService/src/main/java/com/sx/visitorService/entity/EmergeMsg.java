package com.sx.visitorService.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (EmergeMsg)实体类
 *
 * @author makejava
 * @since 2023-07-12 10:06:08
 */
public class EmergeMsg implements Serializable {
    private static final long serialVersionUID = 879439802963072270L;
    
    private Integer emergeId;
    
    private String emergeContext;
    
    private Integer publishId;
    
    private Integer examineId;
    
    private Date publishTime;
    
    private Date expireTime;
    /**
     * 1刚发布2已审批
     */
    private Integer state;


    public Integer getEmergeId() {
        return emergeId;
    }

    public void setEmergeId(Integer emergeId) {
        this.emergeId = emergeId;
    }

    public String getEmergeContext() {
        return emergeContext;
    }

    public void setEmergeContext(String emergeContext) {
        this.emergeContext = emergeContext;
    }

    public Integer getPublishId() {
        return publishId;
    }

    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    public Integer getExamineId() {
        return examineId;
    }

    public void setExamineId(Integer examineId) {
        this.examineId = examineId;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}

