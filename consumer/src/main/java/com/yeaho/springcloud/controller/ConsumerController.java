package com.yeaho.springcloud.controller;

import com.yeaho.springcloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/consumer/product/add")
    public ResponseEntity<Boolean> add(Product product) {
        return restTemplate.postForEntity(REST_URL_PREFIX + "/product/add", product, Boolean.class);
    }

    @GetMapping("/consumer/product/get/{id}")
    public ResponseEntity<Product> get(@PathVariable("id") Long id) {
        return restTemplate.getForEntity(REST_URL_PREFIX + "/product/get/" + id, Product.class);
    }

    @GetMapping("/consumer/product/list")
    public ResponseEntity<List> list() {
        return restTemplate.getForEntity(REST_URL_PREFIX + "/product/list", List.class);
    }
}
