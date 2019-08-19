package com.demo.event.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.demo.event.dao.EventDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class EventService {
    @Autowired
    private EventDao eventDao;

    @LcnTransaction
    @Transactional
    public void create(final String name, final String type) {
        eventDao.create(name, type);
    }

}
