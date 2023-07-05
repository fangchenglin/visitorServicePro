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
    
    private Integer mId;
    
    private String mContext;


    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public String getMContext() {
        return mContext;
    }

    public void setMContext(String mContext) {
        this.mContext = mContext;
    }

}

