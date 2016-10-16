package com.epam.kim.service;

import com.epam.kim.entity.flowers.Flower;

import java.util.Comparator;
import java.util.Date;

public class FlowerDateOfBuyingComporator implements Comparator<Flower> {

    public int compare(Flower flower1, Flower flower2){
        Date dateOfBuying1 = flower1.getDateOfBuying();
        Date dateOfBuying2 = flower2.getDateOfBuying();
        return dateOfBuying1.compareTo(dateOfBuying2);
    };
}
