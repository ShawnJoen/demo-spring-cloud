package com.demo.user.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.demo.user.client.EventClient;
import com.demo.user.client.OrderClient;
import com.demo.user.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class UserService {
    @Autowired
    private OrderClient orderClient;
    @Autowired
    private EventClient eventClient;
    @Autowired
    private UserDao userDao;

    @LcnTransaction
    @Transactional(rollbackFor=Exception.class)
    public void create(final String name, final Integer age, final String status, final String type) {
        eventClient.create(name, type);
        orderClient.create(name, status);
        userDao.create(name, age);
    }

}
