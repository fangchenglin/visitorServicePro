package com.sx.visitorService.DTO;
import com.sx.visitorService.entity.Performing;
import org.apache.ibatis.annotations.Mapper;


public class PerformingDTO extends Performing {
    private Long page;//当前页码
    private Long limit;//每页条数

    public PerformingDTO() {
    }

    public PerformingDTO(Long page, Long limit) {
        this.page = page;
        this.limit = limit;
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
        return "PerformingDTO{" +
                "page=" + page +
                ", limit=" + limit +
                '}';
    }
}
