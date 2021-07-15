package com.example.shop.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ezhepei
 * @version 1.0
 * @description: 商品服务启动类
 * @date 2021/7/13 13:10
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan("com.example.shop.common.entity")
public class ShopProductApp {
    public static void main(String[] args) {
        SpringApplication.run(ShopProductApp.class, args);
    }
}
