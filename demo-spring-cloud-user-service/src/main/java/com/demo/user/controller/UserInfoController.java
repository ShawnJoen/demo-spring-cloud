package com.demo.user.controller;

import com.demo.common.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UserInfoController {

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id, HttpServletRequest request){
        System.out.println("当前服务端口："+request.getServerPort());
        User uesr = new User();
        uesr.setId(id);
        uesr.setAge(30);
        uesr.setName("哈哈" + id);
        return uesr;
    }

}
