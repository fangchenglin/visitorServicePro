package com.sx.visitorService.controller;


import com.sx.visitorService.entity.Suit;
import com.sx.visitorService.service.SuitService;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dealandsuit")
public class dealandsuitController {

    @Autowired
    private SuitService suitService;

    //提交表单
    @PostMapping("suit")
    public DataResult suit(@RequestBody Suit suit){
        return suitService.suit(suit);
    }

    //提交表单
    @PostMapping("deal")
    public DataResult deal(@RequestBody Suit suit){
        return suitService.deal(suit);
    }
}
