package com.sx.visitorService.controller;


import com.sx.visitorService.entity.Person;
import com.sx.visitorService.service.PersonService;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("register")
public class RegisterController {


    @Autowired
    private PersonService personService;

    /**
     * 注册
     * @param person
     * @return
     */
    @PostMapping("register")
    public DataResult login(@RequestBody Person person){
        return personService.register(person);
    }


}
