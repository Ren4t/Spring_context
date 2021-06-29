package com.example.cont;

import org.springframework.stereotype.Component;

@Component
public class Box {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Box() {
        color = "RED";
    }

    public Box(String color) {
        this.color = color;
    }
}
