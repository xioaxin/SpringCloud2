package com.example.shop.product.dao;

import com.example.shop.common.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 13:16
 */
public interface ProductRepository extends  JpaRepository<Product, Integer> {
}
