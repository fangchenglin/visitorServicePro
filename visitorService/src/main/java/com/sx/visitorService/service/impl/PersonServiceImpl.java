package com.sx.visitorService.service.impl;

import com.sx.visitorService.entity.Person;
import com.sx.visitorService.dao.PersonDao;
import com.sx.visitorService.service.PersonService;
import com.sx.visitorService.utils.VerifyUtil;
import com.sx.visitorService.utils.result.DataResult;
import com.sx.visitorService.utils.result.code.Code;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * (Person)表服务实现类
 *
 * @author makejava
 * @since 2023-07-05 12:02:10
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonDao personDao;


    @Resource
    HttpSession session;

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    @Override
    public Person queryById(Integer pId) {
        return this.personDao.queryById(pId);
    }

    /**
     * 分页查询
     *
     * @param person      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Person> queryByPage(Person person, PageRequest pageRequest) {
        long total = this.personDao.count(person);
        return new PageImpl<>(this.personDao.queryAllByLimit(person, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param person 实例对象
     * @return 实例对象
     */
    @Override
    public Person insert(Person person) {
        this.personDao.insert(person);
        return person;
    }

    /**
     * 修改数据
     *
     * @param person 实例对象
     * @return 实例对象
     */
    @Override
    public Person update(Person person) {
        this.personDao.update(person);
        return this.queryById(person.getPId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pId) {
        return this.personDao.deleteById(pId) > 0;
    }


    @Override
    public DataResult register(Person person) {

        Person registerPerson = personDao.register(person);
        if (registerPerson != null) {
            return DataResult.errByErrCode(Code.REGISTER_ERROR);

        }
        int insert_person = personDao.insert(person);
        session.setAttribute("user", person);
        session.setMaxInactiveInterval(60 * 60 * 24);
        return DataResult.successByData(person);
    }
    @Override

    public DataResult loginUser(Person person) {
        //判断参数
        if (VerifyUtil.isNull(person.getPPhone()) || VerifyUtil.isNull(person.getPassword())) {
            return DataResult.errByErrCode(Code.LOGIN_ERROR);
        }
        //查询用户
        Person loginUser = personDao.loginUser(person);
        if (loginUser == null) {
            return DataResult.errByErrCode(Code.NO_EXIST);
        }
        //登陆成功
        loginUser.setPassword("");
        //将用户信息存入session
        session.setAttribute("person", loginUser);
        session.setMaxInactiveInterval(60 * 60 * 24);
        //查询当前用户可以看到的菜单

        //整理返回数据
        return DataResult.successByData(loginUser);
    }
}
