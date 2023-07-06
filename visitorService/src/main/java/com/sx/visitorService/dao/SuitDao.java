package com.sx.visitorService.dao;

import com.sx.visitorService.DTO.SuitDTO;
import com.sx.visitorService.entity.Suit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Suit)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-05 12:02:38
 */
@Mapper
public interface SuitDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Suit queryById(Integer sId);

    /**
     * 查询指定行数据
     *
     * @param suit 查询条件
     * @return 对象列表
     */
    List<Suit> queryAllByLimit(SuitDTO suitDTO);

    /**
     * 统计总行数
     *
     * @param suit 查询条件
     * @return 总行数
     */
    long count(Suit suit);

    /**
     * 新增数据
     *
     * @param suit 实例对象
     * @return 影响行数
     */
    int insert(Suit suit);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Suit> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Suit> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Suit> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Suit> entities);

    /**
     * 修改数据
     *
     * @param suit 实例对象
     * @return 影响行数
     */
    int update(Suit suit);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 影响行数
     */
    int deleteById(Integer sId);

    Suit deal(Suit suit);

    Suit suit(Suit suit);
}

