package com.sx.visitorService.DTO;

import com.sx.visitorService.entity.Suit;

public class suitWithName extends Suit {
    private String submitName;
    private  String submitPhone;
    private  String dealerName;

    public suitWithName() {
    }

    public suitWithName(String submitName, String submitPhone, String dealerName) {
        this.submitName = submitName;
        this.submitPhone = submitPhone;
        this.dealerName = dealerName;
    }

    public String getSubmitName() {
        return submitName;
    }

    public void setSubmitName(String submitName) {
        this.submitName = submitName;
    }

    public String getSubmitPhone() {
        return submitPhone;
    }

    public void setSubmitPhone(String submitPhone) {
        this.submitPhone = submitPhone;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    @Override
    public String toString() {
        return "suitWithName{" +
                "submitName='" + submitName + '\'' +
                ", submitPhone='" + submitPhone + '\'' +
                ", dealerName='" + dealerName + '\'' +
                '}';
    }
}
