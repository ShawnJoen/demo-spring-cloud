package com.demo.event.controller;

import com.demo.event.service.EventService;
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
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/create/{name}/{type}")
    public void create(@PathVariable("name") String name, @PathVariable("type") String type, HttpServletRequest request) {
        log.info("current port: {}", request.getServerPort());
        eventService.create(name, type);
    }

}
