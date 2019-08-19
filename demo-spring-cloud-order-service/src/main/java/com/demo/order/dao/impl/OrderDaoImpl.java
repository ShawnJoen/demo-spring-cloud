package com.demo.order.dao.impl;

import com.demo.common.dao.BaseDao;
import com.demo.common.entity.Order;
import com.demo.order.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public Order findOneByIdToAllFields(final Integer id) {
        return super.getSqlSession().selectOne(super.getStatement("findOneByIdToAllFields"), id);
    }

    @Override
    public void create(final String name, final String status) {
        final Order o = new Order();
        o.setName(name);
        o.setStatus(status);
        super.getSqlSession().insert(super.getStatement("create"), o);
    }

}
