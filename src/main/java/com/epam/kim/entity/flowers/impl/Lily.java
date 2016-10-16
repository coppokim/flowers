package com.epam.kim.entity.flowers.impl;

import com.epam.kim.entity.flowers.Flower;

public class Lily extends Flower {
    private int scaleCount;
    public Lily(int price,int length, String color,int scaleCount){
        super(price,length,color);
        this.scaleCount = scaleCount;
    }

    @Override
    public String toString() {
        return "Lily{" +
                "price=" + getPrice() + "," +
                "length=" + getLength() + "," +
                "color=" + getColor() + "," +
                "dateOfBuying=" + getDateOfBuying() + "," +
                "scaleCount=" + scaleCount +
                '}';
    }
}
