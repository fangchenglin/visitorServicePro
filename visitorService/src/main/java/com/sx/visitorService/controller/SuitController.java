package com.sx.visitorService.controller;

import com.sx.visitorService.entity.Suit;
import com.sx.visitorService.service.SuitService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Suit)表控制层
 *
 * @author makejava
 * @since 2023-07-05 12:02:38
 */
@RestController
@RequestMapping("suit")
public class SuitController {
    /**
     * 服务对象
     */
    @Resource
    private SuitService suitService;

    /**
     * 分页查询
     *
     * @param suit 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Suit>> queryByPage(Suit suit, PageRequest pageRequest) {
        return ResponseEntity.ok(this.suitService.queryByPage(suit, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Suit> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.suitService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param suit 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Suit> add(Suit suit) {
        return ResponseEntity.ok(this.suitService.insert(suit));
    }

    /**
     * 编辑数据
     *
     * @param suit 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Suit> edit(Suit suit) {
        return ResponseEntity.ok(this.suitService.update(suit));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.suitService.deleteById(id));
    }

}

