package com.sx.visitorService.exception;

import com.sx.visitorService.utils.result.DataResult;
import com.sx.visitorService.utils.result.code.Code;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version V1.0
 * @author: hepeng
 * @Title: GlobalExceptionHandler.java
 * @Package:
 * @description:
 * @date: 2023/6/28 10:08
 */
@ControllerAdvice("com.cqdx.springboot")
public class GlobalExceptionHandler {

    /**
     * 出现异常返回错误提示, 并且回滚事务
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public DataResult exceptionHandler(Exception e){
        System.out.println("抓到异常");
        return DataResult.errByErrCode(Code.ERROR);
    }

}
