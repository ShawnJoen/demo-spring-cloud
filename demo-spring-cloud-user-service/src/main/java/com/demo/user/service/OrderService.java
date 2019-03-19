package com.demo.user.service;

import com.demo.common.entity.Order;
import com.demo.user.client.OrderClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {
    @Autowired
    private OrderClient orderClient;

    public Order getOrder(final Integer id) {
        return orderClient.getOrder(id);
    }

}
