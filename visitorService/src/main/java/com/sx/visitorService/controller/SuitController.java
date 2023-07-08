package com.sx.visitorService.controller;

import com.sx.visitorService.DTO.SuitDTO;
import com.sx.visitorService.entity.Suit;
import com.sx.visitorService.service.SuitService;
import com.sx.visitorService.utils.PageUtil;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
     * 上传文件
     */
    @PostMapping("/upload")
    public void upload(@RequestParam("file") MultipartFile file) throws Exception {
        //上传文件
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        byte[] data = file.getBytes();
        System.out.println("img+"+data);
    }
    /*

     */
    @PostMapping("assessSuit")

    public DataResult assessSuit(@RequestBody Suit suit ){
        suit.setState(4);
        Suit update = this.suitService.update(suit);

        return DataResult.successByData(update);
    }

    @PostMapping("fillSuit")
    public DataResult fillSuit(@RequestBody Suit suit){
        suit.setState(5);
        Suit update = this.suitService.update(suit);
        return DataResult.successByData(update);
    }
    @PostMapping("listSuit")
    public DataResult queryByPage(@RequestBody SuitDTO suitDTO) {
        Long page = suitDTO.getPage();
        Long limit = suitDTO.getLimit();
        Long startPage = PageUtil.getStartPage(page, limit);
        suitDTO.setPage(startPage);
        DataResult dataResult = this.suitService.queryByPage(suitDTO);
        return dataResult;
    }


    @PostMapping("undoSuit")
    public DataResult undoSuit(@RequestBody Suit suit) {
        boolean b= this.suitService.deleteById(suit.getSuitId());
        if(b){
            return DataResult.succ();
        }
        return  DataResult.err();
    }

    @PostMapping("allocSuit")
    public  DataResult allocSuit(@RequestBody Suit suit){
        Suit update = this.suitService.update(suit);
        return DataResult.successByData(update);
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

