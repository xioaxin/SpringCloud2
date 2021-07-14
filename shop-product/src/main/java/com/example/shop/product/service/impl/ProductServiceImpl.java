package com.example.shop.product.service.impl;

import com.example.shop.common.entity.Product;
import com.example.shop.product.dao.ProductRepository;
import com.example.shop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 13:14
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findByPid(Integer pid) {
        return productRepository.getOne(pid);
    }
}
