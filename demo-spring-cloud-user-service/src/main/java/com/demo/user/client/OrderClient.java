package com.demo.user.client;

import com.demo.common.entity.Order;
import com.demo.user.client.impl.OrderClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "order-service", fallback = OrderClientImpl.class)
public interface OrderClient {
    @PostMapping("/order/{id}")
    Order getOrder(@PathVariable("id") Integer id);

}
