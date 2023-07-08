package com.sx.visitorService.entity;

import java.io.Serializable;

/**
 * (Suit)实体类
 *
 * @author makejava
 * @since 2023-07-05 12:02:38
 */
public class Suit implements Serializable {
    private static final long serialVersionUID = 257618745811842842L;
    
    private Integer suitId;
    
    private Integer submitId;
    
    private Integer dealId;
    
    private String submitContext;
    
    private String submitIma;
    
    private String submitVideo;
    /**
     * 打分
     */
    private Integer assess;
    
    private String dealContext;
    
    private String dealIma;
    
    private String dealVideo;
    /**
     * 投诉表单状态1：刚提交，未审批  2：已分配，未处理  3：处理完，未打分  4：已打分，未结案  5：已结案
     */
    private Integer state;


    public Integer getSuitId() {
        return suitId;
    }

    public void setSuitId(Integer sId) {
        this.suitId = sId;
    }

    public Integer getSubmitId() {
        return submitId;
    }

    public void setSubmitId(Integer submitId) {
        this.submitId = submitId;
    }

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public String getSubmitContext() {
        return submitContext;
    }

    public void setSubmitContext(String submitContext) {
        this.submitContext = submitContext;
    }

    public String getSubmitIma() {
        return submitIma;
    }

    public void setSubmitIma(String submitIma) {
        this.submitIma = submitIma;
    }

    public String getSubmitVideo() {
        return submitVideo;
    }

    public void setSubmitVideo(String submitVideo) {
        this.submitVideo = submitVideo;
    }

    public Integer getAssess() {
        return assess;
    }

    public void setAssess(Integer assess) {
        this.assess = assess;
    }

    public String getDealContext() {
        return dealContext;
    }

    public void setDealContext(String dealContext) {
        this.dealContext = dealContext;
    }

    public String getDealIma() {
        return dealIma;
    }

    public void setDealIma(String dealIma) {
        this.dealIma = dealIma;
    }

    public String getDealVideo() {
        return dealVideo;
    }

    public void setDealVideo(String dealVideo) {
        this.dealVideo = dealVideo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "suitId=" + suitId +
                ", submitId=" + submitId +
                ", dealId=" + dealId +
                ", submitContext='" + submitContext + '\'' +
                ", submitIma='" + submitIma + '\'' +
                ", submitVideo='" + submitVideo + '\'' +
                ", assess=" + assess +
                ", dealContext='" + dealContext + '\'' +
                ", dealIma='" + dealIma + '\'' +
                ", dealVideo='" + dealVideo + '\'' +
                ", state=" + state +
                '}';
    }
}

