package com.example.shop.order.dao;

import com.example.shop.common.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/14 13:04
 */
public interface OrderDao extends JpaRepository<Order, Long> {
}
