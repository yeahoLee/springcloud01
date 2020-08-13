package com.yeaho.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yeaho.springcloud.entity.Product;
import com.yeaho.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductContorller {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/add")
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }


    //方法调用异常调用指定方法处理
    //处理方法的返回值和参数类型要一致
    @HystrixCommand(fallbackMethod = "getFallBack")
    @GetMapping("/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);

        if (product == null) {
            throw new RuntimeException("ID=" + id + "无效");
        }

        return product;
    }

    public Product getFallBack(@PathVariable("id") Long id) {

        return new Product(id, "ID=" + id + "无效", "无法找到对应数据库");
    }

    @GetMapping("/product/list")
    public List<Product> list() {
        return productService.list();
    }
}
