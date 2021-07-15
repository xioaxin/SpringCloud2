package com.example.shop.order.controller;

import com.example.shop.common.entity.Order;
import com.example.shop.common.entity.Product;
import com.example.shop.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/order/prod/{pid}")
    public Order getOrder(@PathVariable("pid") Integer pid) {
        ServiceInstance serviceInstance = discoveryClient.getInstances("service-product").get(0);
        String url = serviceInstance.getHost() + ":" + serviceInstance.getPort();
        System.out.println("http://" + url +"/product/"+ pid);
        Product product = restTemplate.getForObject("http://" + url +"/product/"+ pid, Product.class);
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");
        order.setPid(product.getPid());
        return order;
    }
}
