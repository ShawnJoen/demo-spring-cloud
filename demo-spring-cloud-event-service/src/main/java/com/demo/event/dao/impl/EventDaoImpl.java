package com.demo.event.dao.impl;

import com.demo.common.dao.BaseDao;
import com.demo.common.entity.Event;
import com.demo.event.dao.EventDao;
import org.springframework.stereotype.Repository;

@Repository
public class EventDaoImpl extends BaseDao implements EventDao {
    @Override
    public void create(final String name, final String type) {
        final Event o = new Event();
        o.setName(name);
        o.setType(type);
        super.getSqlSession().insert(super.getStatement("create"), o);
    }

}
