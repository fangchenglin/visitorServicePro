package com.sx.visitorService.dao;

import com.sx.visitorService.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Person)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-05 12:02:10
 */
@Mapper
public interface PersonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    Person queryById(Integer pId);

    /**
     * 查询指定行数据
     *
     * @param person 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Person> queryAllByLimit(Person person, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param person 查询条件
     * @return 总行数
     */
    long count(Person person);

    /**
     * 新增数据
     *
     * @param person 实例对象
     * @return 影响行数
     */
    int insert(Person person);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Person> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Person> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Person> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Person> entities);

    /**
     * 修改数据
     *
     * @param person 实例对象
     * @return 影响行数
     */
    int update(Person person);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 影响行数
     */
    int deleteById(Integer pId);
    Person register(Person person);
    Person loginUser(Person person);
}

