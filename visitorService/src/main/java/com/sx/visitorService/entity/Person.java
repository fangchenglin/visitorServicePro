package com.sx.visitorService.entity;

import java.io.Serializable;

/**
 * (Person)实体类
 *
 * @author makejava
 * @since 2023-07-05 12:02:10
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 909529084913365238L;
    
    private Integer personId;
    
    private String personName;
    /**
     * 0：未登录用户  1：游客  2：处理  3：管理  4：审批 5：酒店
     */
    private Integer personPower;
    
    private String personPhone;
    
    private String password;
    
    private String birth;


    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonPower() {
        return personPower;
    }

    public void setPersonPower(Integer personPower) {
        this.personPower = personPower;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String pPhone) {
        this.personPhone = pPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

}

