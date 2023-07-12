package com.sx.visitorService.controller;

import com.sx.visitorService.DTO.EmergeMsgDTO;
import com.sx.visitorService.entity.EmergeMsg;
import com.sx.visitorService.utils.result.DataResult;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class EmergeMsgControllerTest {
    @Autowired
    private EmergeMsgController emergeMsgController;

    @Test
    public void testPublishMsg() {
        EmergeMsg emergeMsg = new EmergeMsg();
        emergeMsg.setState(1);
        emergeMsg.setEmergeContext("test");

        DataResult dataResult = emergeMsgController.publishMsg(emergeMsg);        System.out.println("test");
        System.out.println("test"+dataResult.toString());

    }

    @Test
    public void testlistMsg() {
        EmergeMsgDTO emergeMsgDTO = new EmergeMsgDTO();
        emergeMsgDTO.setPage(1L);
        emergeMsgDTO.setLimit(4L);


        DataResult dataResult = emergeMsgController.queryByPage(emergeMsgDTO);
        System.out.println(dataResult.toString());

    }
}