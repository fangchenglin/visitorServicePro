package com.sx.visitorService.dao;

import com.sx.visitorService.DTO.HotelDTO;
import com.sx.visitorService.DTO.PerformingDTO;
import com.sx.visitorService.entity.Performing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Performing)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-13 09:54:12
 */
@Mapper
public interface PerformingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param performingId 主键
     * @return 实例对象
     */
    Performing queryById(Integer performingId);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<Performing> queryAllByLimit(PerformingDTO performingDTO);

    /**
     * 统计总行数
     *
     * @param performing 查询条件
     * @return 总行数
     */
    long count(Performing performing);

    /**
     * 新增数据
     *
     * @param performing 实例对象
     * @return 影响行数
     */
    int insert(Performing performing);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Performing> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Performing> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Performing> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Performing> entities);

    /**
     * 修改数据
     *
     * @param performing 实例对象
     * @return 影响行数
     */
    int update(Performing performing);

    /**
     * 通过主键删除数据
     *
     * @param performingId 主键
     * @return 影响行数
     */
    int deleteById(Integer performingId);

}

