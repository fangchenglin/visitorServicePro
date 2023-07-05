package com.sx.visitorService.utils;

public class PageUtil {
    public static Long getStartPage(Long page, Long limit){
        return (page - 1) * limit;
    }
}
