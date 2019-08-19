package com.demo.user2.dao;

import com.demo.common.entity.User;

public interface UserDao {
    User findOneByIdToAllFields(Integer id);
    void create(String name, Integer age);
}
