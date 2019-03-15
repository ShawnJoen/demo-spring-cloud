package com.demo.order.controller;

import com.demo.common.entity.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class OrderController {
    @Value("${test.info.arg1}")
    String arg1;
    @Value("${test.info.arg2}")
    String arg2;
    @Value("${test.info.arg3}")
    String arg3;
    @Value("${test.info.arg4}")
    String arg4;

    @PostMapping("/order/{id}")
    public Order getOrder(@PathVariable("id") Integer id, HttpServletRequest request) {
        System.out.println("当前服务端口："+request.getServerPort());
        Order order = new Order();
        order.setId(id);
        order.setAge(30);
        order.setName("订单服务 参数:" + arg1 + " * " + arg2 + " * " + arg3 + " * " + arg4);
        return order;
    }

}
