package com.yeaho.springcloud.service;

import com.yeaho.springcloud.entity.Product;

import java.util.List;

public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
