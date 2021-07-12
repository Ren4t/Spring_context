package com.example.cont;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Box box = applicationContext.getBean(Box.class);
        System.out.println(box.getColor());

        ProductRepository products = applicationContext.getBean(ProductRepository.class);

        Cart cart1 = applicationContext.getBean(Cart.class);
        Cart cart2 = applicationContext.getBean(Cart.class);
        try {
            cart1.add(products.getProduct(1));
            cart1.add(products.getProduct(4));
            cart1.add(products.getProduct(4));
            cart1.add(products.getProduct(2));
            cart1.add(products.getProduct(1));
            cart1.add(products.getProduct(5));

            cart2.add(products.getProduct(4));
            cart2.add(products.getProduct(4));
            cart2.add(products.getProduct(4));
            cart2.add(products.getProduct(3));
            cart2.add(products.getProduct(3));


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(cart1.toString());
        cart1.remove(4);
        cart1.remove(1);
        System.out.println(cart1.toString());
        System.out.println();

        System.out.println(cart2.toString());
        cart2.remove(4);
        System.out.println(cart2.toString());

        applicationContext.close();
    }
}
