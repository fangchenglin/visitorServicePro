package com.sx.visitorService.controller;

import com.sx.visitorService.entity.EmergeMsg;
import com.sx.visitorService.service.EmergeMsgService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (EmergeMsg)表控制层
 *
 * @author makejava
 * @since 2023-07-12 10:06:06
 */
@RestController
@RequestMapping("emergeMsg")
public class EmergeMsgController {
    /**
     * 服务对象
     */
    @Resource
    private EmergeMsgService emergeMsgService;

    /**
     * 分页查询
     *
     * @param emergeMsg 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<EmergeMsg>> queryByPage(EmergeMsg emergeMsg, PageRequest pageRequest) {
        return ResponseEntity.ok(this.emergeMsgService.queryByPage(emergeMsg, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<EmergeMsg> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.emergeMsgService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param emergeMsg 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<EmergeMsg> add(EmergeMsg emergeMsg) {
        return ResponseEntity.ok(this.emergeMsgService.insert(emergeMsg));
    }

    /**
     * 编辑数据
     *
     * @param emergeMsg 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<EmergeMsg> edit(EmergeMsg emergeMsg) {
        return ResponseEntity.ok(this.emergeMsgService.update(emergeMsg));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.emergeMsgService.deleteById(id));
    }

}

