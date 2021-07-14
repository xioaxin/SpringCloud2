package com.example.shop.product;

import com.example.shop.product.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 13:20
 */
@SpringBootTest
public class TestApplication {
    @Autowired
    private ProductService productService;

    @Test
    public void test() {
        System.out.println(productService.findByPid(1).toString());
    }
}
