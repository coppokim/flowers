package com.epam.kim.flowers.rose;

import com.epam.kim.flowers.Flower;

import java.util.Date;

public class Rose extends Flower{
    Rose(int price,int length,String color,Date date){
        setPrice(price);
        setLength(length);
        setColor(color);
        setDateOfBuying(date);
    }
}
