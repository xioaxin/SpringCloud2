package com.example.shop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ezhepei
 * @version 1.0
 * @description: 订单服务启动类
 * @date 2021/7/14 13:03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan("com.example.shop.common.entity")
public class ShopOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopOrderApplication.class, args);
    }
}
