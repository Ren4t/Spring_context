package com.example.cont;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    @PostConstruct
    public void init(){
        productList = new ArrayList<>();
        for (int i = 1; i < 6;i++){
            productList.add(new Product(i,"prod" + i,i*165));
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProduct(int ind) throws Exception {
        for (Product product : productList) {
            if(product.getId() == ind) {
                return product;
            }
        }
        throw new Exception();
    }
}
