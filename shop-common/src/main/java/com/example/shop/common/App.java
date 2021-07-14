package com.example.shop.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 13:36
 */
@EntityScan("com.example.common.entity")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
