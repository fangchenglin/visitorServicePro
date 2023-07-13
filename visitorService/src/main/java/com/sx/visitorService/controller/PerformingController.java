package com.sx.visitorService.controller;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.PerformingDTO;
import com.sx.visitorService.entity.Performing;
import com.sx.visitorService.service.PerformingService;
import com.sx.visitorService.utils.PageUtil;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Performing)表控制层
 *
 * @author makejava
 * @since 2023-07-13 09:54:12
 */
@RestController
@RequestMapping("performing")
public class PerformingController {
    /**
     * 服务对象
     */
    @Resource
    private PerformingService performingService;

    /**
     * 分页查询
     *

     * @return 查询结果
     */
    @PostMapping("listPerforming")
    public DataResult queryByPage(@RequestBody PerformingDTO performingDTO) {
        Long page = performingDTO.getPage();
        Long limit = performingDTO.getLimit();
        Long startPage = PageUtil.getStartPage(page, limit);
        performingDTO.setPage(startPage);
        DataResult dataResult = this.performingService.queryByPage(performingDTO);
        return dataResult;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Performing> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.performingService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param performing 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Performing> add(Performing performing) {
        return ResponseEntity.ok(this.performingService.insert(performing));
    }

    /**
     * 编辑数据
     *
     * @param performing 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Performing> edit(Performing performing) {
        return ResponseEntity.ok(this.performingService.update(performing));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.performingService.deleteById(id));
    }

}

