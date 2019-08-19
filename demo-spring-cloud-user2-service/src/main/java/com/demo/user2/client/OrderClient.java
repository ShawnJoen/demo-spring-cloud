package com.demo.user2.client;

import com.demo.common.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "order-service")
public interface OrderClient {
    @PostMapping("/order/{id}")
    Order getOrder(@PathVariable("id") Integer id);
    @PostMapping("/create/{name}/{status}")
    String create(@PathVariable("name") String name, @PathVariable("status") String status);
}
