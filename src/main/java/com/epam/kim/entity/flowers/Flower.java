package com.epam.kim.entity.flowers;

import com.epam.kim.FlowerBuilder;

public  class Flower extends FlowerBuilder{
    private int price;
    private int length;
    private String color;

    public Flower(int price, int length, String color) {
        this.price = price;
        this.length = length;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}
