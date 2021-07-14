package com.example.shop.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 12:59
 */
@SpringBootApplication
@EntityScan("com.example.shop.common.entity")
public class ShopUserApp {
    public static void main(String[] args) {
        SpringApplication.run(ShopUserApp.class, args);
    }
}
