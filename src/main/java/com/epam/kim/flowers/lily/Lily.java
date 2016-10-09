package com.epam.kim.flowers.lily;

import com.epam.kim.flowers.Flower;

import java.util.Date;

public class Lily extends Flower {
    Lily(int price,int length,String color,Date date){
        setPrice(price);
        setLength(length);
        setColor(color);
        setDateOfBuying(date);
    }
}
