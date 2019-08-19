package com.demo.user2.dao.impl;

import com.demo.common.dao.BaseDao;
import com.demo.common.entity.User;
import com.demo.user2.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User findOneByIdToAllFields(final Integer id) {
        return super.getSqlSession().selectOne(super.getStatement("findOneByIdToAllFields"), id);
    }

    @Override
    public void create(final String name, final Integer age) {
        final User o = new User();
        o.setName(name);
        o.setAge(age);
        super.getSqlSession().insert(super.getStatement("create"), o);
    }

}

