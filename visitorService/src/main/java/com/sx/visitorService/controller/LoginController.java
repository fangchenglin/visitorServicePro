package com.sx.visitorService.controller;

import com.sx.visitorService.entity.Person;
import com.sx.visitorService.service.PersonService;
import com.sx.visitorService.utils.result.DataResult;
import com.sx.visitorService.entity.Person;
import com.sx.visitorService.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private PersonService personService;

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping("login")
    public DataResult login(@RequestBody Person user){
        return personService.loginUser(user);
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @PostMapping("loginOut")
    public DataResult loginOut(HttpSession session){
        session.invalidate();
        return DataResult.succ();
    }

}
