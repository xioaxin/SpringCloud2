package com.example.shop.order.service.impl;

import com.example.shop.common.entity.Order;
import com.example.shop.order.dao.OrderDao;
import com.example.shop.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ezhepei
 * @version 1.0
 * @description: 订单服务层实现类
 * @date 2021/7/14 13:10
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }
}
