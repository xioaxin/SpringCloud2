package com.example.shop.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author ezhepei
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 12:55
 */
@Entity
@Table(name = "shop_product")
@Data
@NoArgsConstructor
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    private String pname;
    private Double pprice;
    private Integer stock;

}
