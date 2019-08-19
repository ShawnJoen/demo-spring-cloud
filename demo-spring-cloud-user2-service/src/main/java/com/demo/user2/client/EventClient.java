package com.demo.user2.client;

import com.demo.user2.client.impl.EventClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "event-service", fallback = EventClientImpl.class)
public interface EventClient {
    @PostMapping("/create/{name}/{type}")
    String create(@PathVariable("name") String name, @PathVariable("type") String type);
}

