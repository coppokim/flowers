package com.epam.kim.entity.flowers.impl;

import com.epam.kim.entity.flowers.Flower;

public class Rose extends Flower{

    private int thornsCount;

    public Rose(int price, int length, String color,int thornsCount){
        super(price,length,color);
        this.thornsCount = thornsCount;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "price=" + getPrice() + "," +
                "length=" + getLength() + "," +
                "color=" + getColor() + "," +
                "dateOfBuying=" + getDateOfBuying() + "," +
                "thornsCount=" + thornsCount +
                '}';
    }
}
