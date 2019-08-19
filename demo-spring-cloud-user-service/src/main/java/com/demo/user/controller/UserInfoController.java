package com.demo.user.controller;

import com.codingapi.txlcn.tc.annotation.TxTransaction;
import com.demo.common.entity.Order;
import com.demo.common.entity.User;
import com.demo.user.service.OrderService;
import com.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class UserInfoController {
    @Value("${test.info.arg1}")
    String arg1;
    @Value("${test.info.arg2}")
    String arg2;
    @Value("${test.info.arg3}")
    String arg3;
    @Value("${test.info.arg4}")
    String arg4;

    @GetMapping("/user/{age}")
    public User getUser(@PathVariable("age") Integer age, HttpServletRequest request) {
        System.out.println("当前服务端口："+ request.getServerPort());
        User uesr = new User();
        uesr.setAge(age);
        uesr.setName("用户服务 参数:" + arg1 + " * " + arg2 + " * " + arg3 + " * " + arg4);
        return uesr;
    }

    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;

    @GetMapping("/userOrder/{id}")
    public Order getOrder(@PathVariable("id") Integer id, HttpServletRequest request) {
        System.out.println("当前服务端口：" + request.getServerPort());
        return orderService.getOrder(id);
    }

    @GetMapping("/create/{var}")
    public User create(@PathVariable("var") Integer var, HttpServletRequest request) {
        System.out.println("当前服务端口：" + request.getServerPort());
        userService.create("测试", var, "订单状态:1234567890" + var, "活动类型");
        return null;
    }

}
