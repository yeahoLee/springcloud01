package com.yeaho.springcloud.mapper;

import com.yeaho.springcloud.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);

}
