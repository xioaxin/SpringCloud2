package com.example.shop.order.controller;

import com.example.shop.common.entity.Order;
import com.example.shop.common.entity.Product;
import com.example.shop.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/14 13:14
 */
@RestController
@CrossOrigin
@Slf4j
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/prod/{pid}")
    public Order getOrder(@PathVariable("pid") Integer pid) {
        Order order = new Order();
        Product product = restTemplate.getForObject("http://localhost:8081/product/" + pid, Product.class);
        BeanUtils.copyProperties(product, order);
        return order;
    }
}
