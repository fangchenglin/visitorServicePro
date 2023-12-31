package com.sx.visitorService.service;

import com.sx.visitorService.DTO.SuitDTO;
import com.sx.visitorService.entity.Suit;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Suit)表服务接口
 *
 * @author makejava
 * @since 2023-07-05 12:02:38
 */
public interface SuitService {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Suit queryById(Integer sId);

    /**
     * 分页查询
     *
     * @param suitDTO 筛选条件
     * @return 查询结果
     */
    DataResult queryByPage(SuitDTO suitDTO);

    /**
     * 新增数据
     *
     * @param suit 实例对象
     * @return 实例对象
     */
    Suit insert(Suit suit);

    /**
     * 修改数据
     *
     * @param suit 实例对象
     * @return 实例对象
     */
    Suit update(Suit suit);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sId);

    //提交表单
    DataResult deal(Suit suit);

    DataResult suit(Suit suit);
}
