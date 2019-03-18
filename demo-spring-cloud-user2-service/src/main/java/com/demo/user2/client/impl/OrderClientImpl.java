package com.demo.user2.client.impl;

import com.demo.common.entity.Order;
import com.demo.user2.client.OrderClient;
import org.springframework.stereotype.Component;

@Component
public class OrderClientImpl implements OrderClient {
    @Override
    public Order getOrder(Integer id) {
        System.out.println("调用了熔断器类[OrderClientImpl]");
        Order order = new Order();
        order.setName("error");
        return order;
    }

}
