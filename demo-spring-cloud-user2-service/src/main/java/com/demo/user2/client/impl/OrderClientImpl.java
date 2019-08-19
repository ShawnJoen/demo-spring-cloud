package com.demo.user2.client.impl;

import com.demo.common.entity.Order;
import com.demo.user2.client.OrderClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@Component
public class OrderClientImpl implements OrderClient {
    @Override
    public Order getOrder(Integer id) {
        return null;
    }

    @Override
    public String create(@PathVariable("name") String name, @PathVariable("status") String status) {
        return null;
    }

}
