package com.demo.order.controller;

import com.demo.common.entity.Order;
import com.demo.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RefreshScope
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order/{id}")
    public Order getOrder(@PathVariable("id") Integer id, HttpServletRequest request) {
        Order order = orderService.findOneByIdToAllFields(id);
        log.info("current port: {}, order info: {}", request.getServerPort(), order);
        return order;
    }

    @PostMapping("/create/{name}/{status}")
    public void create(@PathVariable("name") String name, @PathVariable("status") String status, HttpServletRequest request) {
        orderService.create(name, status);
    }

}
