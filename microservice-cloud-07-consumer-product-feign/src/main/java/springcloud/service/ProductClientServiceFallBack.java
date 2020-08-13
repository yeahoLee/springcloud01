package springcloud.service;

import com.yeaho.springcloud.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : yeaho_lee
 * @Description : TODO
 * @createTime : 2020年08月13日 16:58
 */
@Component
public class ProductClientServiceFallBack implements ProductClientService{

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "id = " + id + "无数据=--@feignClientHystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
