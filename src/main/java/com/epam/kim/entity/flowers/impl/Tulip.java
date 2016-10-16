package com.epam.kim.entity.flowers.impl;

import com.epam.kim.entity.flowers.Flower;

public class Tulip extends Flower {
    private int stolonCount;

    public Tulip(int price, int length, String color,int stolonCount) {
        super(price,length,color);
        this.stolonCount = stolonCount;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "price=" + getPrice() + "," +
                "length=" + getLength() + "," +
                "color=" + getColor() + "," +
                "dateOfBuying=" + getDateOfBuying() + "," +
                "stolonCount=" + stolonCount +
                '}';
    }
}
