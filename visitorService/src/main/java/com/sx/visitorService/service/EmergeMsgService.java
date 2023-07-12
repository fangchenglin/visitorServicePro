package com.sx.visitorService.service;

import com.sx.visitorService.DTO.EmergeMsgDTO;
import com.sx.visitorService.DTO.SuitDTO;
import com.sx.visitorService.entity.EmergeMsg;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (EmergeMsg)表服务接口
 *
 * @author makejava
 * @since 2023-07-12 10:06:08
 */
public interface EmergeMsgService {

    /**
     * 通过ID查询单条数据
     *
     * @param emergeId 主键
     * @return 实例对象
     */
    EmergeMsg queryById(Integer emergeId);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    DataResult queryByPage(EmergeMsgDTO emergeMsgDTO);

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
     * @param emergeId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer emergeId);

    DataResult publish(EmergeMsg emergeMsg);
}
