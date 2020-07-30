package springcloud.controller;

import com.yeaho.springcloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springcloud.service.ProductClientService;

import java.util.List;

@RestController
public class ConsumerController {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://microservice-product";

    @Autowired
    private ProductClientService productClientService;


    @GetMapping("/consumer/product/add")
    public boolean add(Product product) {
        return productClientService.add(product);
    }

    @GetMapping("/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productClientService.get(id);
    }

    @GetMapping("/consumer/product/list")
    public List list() {
        return productClientService.list();
    }
}
