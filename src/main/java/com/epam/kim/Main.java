package com.epam.kim;


import com.epam.kim.entity.bouquet.Bouquet;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(10);
        System.out.println(bouquet.getFlowerList());


    }
}
