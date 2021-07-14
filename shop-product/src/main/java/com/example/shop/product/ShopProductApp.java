package com.example.shop.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 13:10
 */
@SpringBootApplication
@EntityScan("com.example.shop.common.entity")
public class ShopProductApp {
    public static void main(String[] args) {
        SpringApplication.run(ShopProductApp.class, args);
    }
}
