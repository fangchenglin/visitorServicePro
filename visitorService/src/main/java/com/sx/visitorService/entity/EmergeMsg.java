package com.sx.visitorService.entity;

import java.io.Serializable;

/**
 * (EmergeMsg)实体类
 *
 * @author makejava
 * @since 2023-07-05 12:01:41
 */
public class EmergeMsg implements Serializable {
    private static final long serialVersionUID = -81594206977684526L;
    
    private Integer emergeId;
    
    private String emergeContext;


    public Integer getEmergeId() {
        return emergeId;
    }

    public void setEmergeId(Integer mId) {
        this.emergeId = mId;
    }

    public String getEmergeContext() {
        return emergeContext;
    }

    public void setEmergeContext(String mContext) {
        this.emergeContext = mContext;
    }

}

