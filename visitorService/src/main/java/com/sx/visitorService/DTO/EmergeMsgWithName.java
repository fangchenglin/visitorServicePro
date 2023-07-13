package com.sx.visitorService.DTO;

import com.sx.visitorService.entity.EmergeMsg;

public class EmergeMsgWithName extends EmergeMsg {
    private String publishName;
    private  String examineName;

    public EmergeMsgWithName() {
    }

    public EmergeMsgWithName(String publishName, String examineName) {
        this.publishName = publishName;
        this.examineName = examineName;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public String getExamineName() {
        return examineName;
    }

    public void setExamineName(String examineName) {
        this.examineName = examineName;
    }

    @Override
    public String toString() {
        return "EmergeMsgWithName{" +
                "publishName='" + publishName + '\'' +
                ", examineName='" + examineName + '\'' +
                '}';
    }
}
