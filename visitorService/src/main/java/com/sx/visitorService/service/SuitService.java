package com.sx.visitorService.service;

import com.sx.visitorService.entity.Suit;
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
     * @param suit 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Suit> queryByPage(Suit suit, PageRequest pageRequest);

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

}
