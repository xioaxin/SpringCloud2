package com.example.shop.product.controller;

import com.example.shop.common.entity.Product;
import com.example.shop.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 13:12
 */
@Slf4j
@RestController
public class ProductController {
    @Resource
    private ProductService productService;

    @GetMapping("/product/{pid}")
    public Product product(@PathVariable("pid") Integer pid) {
        System.out.println("Hello");
        Product product = productService.findByPid(pid);
        return product;
    }
}
