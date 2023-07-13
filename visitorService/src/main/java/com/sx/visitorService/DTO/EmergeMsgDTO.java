package com.sx.visitorService.DTO;

import com.sx.visitorService.entity.EmergeMsg;

public class EmergeMsgDTO extends EmergeMsg {
    private Long page;//当前页码
    private Long limit;//每页条数

    public EmergeMsgDTO(Long page, Long limit) {
        this.page = page;
        this.limit = limit;
    }

    public EmergeMsgDTO() {
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "EmergeMsgDTO{" +
                "page=" + page +
                ", limit=" + limit +
                '}';
    }
}
