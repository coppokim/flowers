package com.epam.kim.entity.flowers;

import java.util.Date;
import java.util.Random;

public abstract class Flower implements Comparable<Flower>{
    private int price;
    private int length;
    private String color;
    private Date dateOfBuying;

    public Flower(int price, int length, String color) {
        Random random = new Random();
        this.price = price;
        this.length = length;
        this.color = color;
        this.dateOfBuying = new Date(System.currentTimeMillis() + random.nextInt(120)*1000);
        //this.dateOfBuying = dateOfBuying;
    }

    public Date getDateOfBuying() {
        return dateOfBuying;
    }

    public void setDateOfBuying(Date dateOfBuying) {
        this.dateOfBuying = dateOfBuying;
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
    public int compareTo(Flower flower) {
        return this.dateOfBuying.compareTo(flower.dateOfBuying);
    }
}
