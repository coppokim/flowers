package com.epam.kim.flowers.tulip;

import com.epam.kim.flowers.Flower;

import java.util.Date;

public class Tulip extends Flower {
    Tulip(int price,int length,String color,Date date){
        setPrice(price);
        setLength(length);
        setColor(color);
        setDateOfBuying(date);
    }
}
