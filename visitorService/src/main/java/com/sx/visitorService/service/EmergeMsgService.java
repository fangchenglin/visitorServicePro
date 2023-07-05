package com.sx.visitorService.service;

import com.sx.visitorService.entity.EmergeMsg;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (EmergeMsg)表服务接口
 *
 * @author makejava
 * @since 2023-07-05 12:01:41
 */
public interface EmergeMsgService {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    EmergeMsg queryById(Integer mId);

    /**
     * 分页查询
     *
     * @param emergeMsg 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<EmergeMsg> queryByPage(EmergeMsg emergeMsg, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param emergeMsg 实例对象
     * @return 实例对象
     */
    EmergeMsg insert(EmergeMsg emergeMsg);

    /**
     * 修改数据
     *
     * @param emergeMsg 实例对象
     * @return 实例对象
     */
    EmergeMsg update(EmergeMsg emergeMsg);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mId);

}
