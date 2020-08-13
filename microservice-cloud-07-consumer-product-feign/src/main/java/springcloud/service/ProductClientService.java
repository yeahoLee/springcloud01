package springcloud.service;

import com.yeaho.springcloud.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "microservice-product", fallback = ProductClientServiceFallBack.class)

public interface ProductClientService {


    @PostMapping("/product/add")
    boolean add(@RequestBody Product product);

    @GetMapping("/product/get/{id}")
    Product get(@PathVariable("id") Long id);

    @GetMapping("/product/list")
    List<Product> list();

}
