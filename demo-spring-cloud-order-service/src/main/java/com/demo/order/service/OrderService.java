package com.demo.order.service;

import com.codingapi.txlcn.tc.annotation.*;
import com.demo.common.entity.Order;
import com.demo.order.dao.OrderDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    public Order findOneByIdToAllFields(final Integer id) {
        return orderDao.findOneByIdToAllFields(id);
    }

    @LcnTransaction
    @Transactional
    public void create(final String name, final String status) {
        orderDao.create(name, status);
    }

}
