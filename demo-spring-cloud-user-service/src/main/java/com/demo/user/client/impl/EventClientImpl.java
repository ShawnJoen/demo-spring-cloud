package com.demo.user.client.impl;

import com.demo.user.client.EventClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@Component
public class EventClientImpl implements EventClient {
    @Override
    public String create(@PathVariable("name") String name, @PathVariable("type") String type) {
        return null;
    }

}
