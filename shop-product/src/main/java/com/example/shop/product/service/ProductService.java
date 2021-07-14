package com.example.shop.product.service;

import com.example.shop.common.entity.Product;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 13:13
 */

public interface ProductService {
    Product findByPid(Integer pid);
}
