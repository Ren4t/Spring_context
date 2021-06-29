package com.example.cont;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Box box = applicationContext.getBean(Box.class);
        System.out.println(box.getColor());

        applicationContext.close();
    }
}
