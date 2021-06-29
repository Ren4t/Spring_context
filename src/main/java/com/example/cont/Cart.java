package com.example.cont;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private List<Product> productList;

    @PostConstruct
    public void init(){
        productList = new ArrayList<>();
    }

    public void add(Product product) {
        productList.add(product);
    }

    public void remove(int id) {
        if (productList.size() == 0) {
            return;
        }
        for (int i = 0; i < productList.size(); ){
            if(productList.get(i).getId() == id) {
                productList.remove(i);
            } else {
                i++;
            }
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productList=" + productList +
                '}';
    }
}
