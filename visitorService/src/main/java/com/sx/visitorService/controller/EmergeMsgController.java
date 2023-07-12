package com.sx.visitorService.controller;

import com.sx.visitorService.DTO.EmergeMsgDTO;
import com.sx.visitorService.DTO.SuitDTO;
import com.sx.visitorService.entity.EmergeMsg;
import com.sx.visitorService.entity.Suit;
import com.sx.visitorService.service.EmergeMsgService;
import com.sx.visitorService.utils.PageUtil;
import com.sx.visitorService.utils.result.DataResult;
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
    @PostMapping("examineMsg")
    public  DataResult examineMsg(@RequestBody EmergeMsg emergeMsg){
        emergeMsg.setState(2);
        EmergeMsg update = this.emergeMsgService.update(emergeMsg);
        return DataResult.successByData(update);
    }
    @PostMapping("changeMsg")
    public  DataResult changeMsg(@RequestBody EmergeMsg emergeMsg){
        EmergeMsg update = this.emergeMsgService.update(emergeMsg);
        return DataResult.successByData(update);
    }
    @PostMapping("undoMsg")
    public DataResult undoMsg(@RequestBody EmergeMsg emergeMsg) {
        boolean b= this.emergeMsgService.deleteById(emergeMsg.getEmergeId());
        if(b){
            return DataResult.succ();
        }
        return  DataResult.err();
    }
    @PostMapping("publishMsg")
    public DataResult publishMsg(@RequestBody EmergeMsg emergeMsg) {
        emergeMsg.setState(1);
        return emergeMsgService.publish(emergeMsg);
    }
    @PostMapping("listMsg")
    public DataResult queryByPage(@RequestBody EmergeMsgDTO emergeMsgDTO) {
        Long page = emergeMsgDTO.getPage();
        Long limit = emergeMsgDTO.getLimit();
        Long startPage = PageUtil.getStartPage(page, limit);
        emergeMsgDTO.setPage(startPage);
        DataResult dataResult = this.emergeMsgService.queryByPage(emergeMsgDTO);
        return dataResult;
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

