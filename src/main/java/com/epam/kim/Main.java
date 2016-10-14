package com.epam.kim;


import com.epam.kim.entity.bouquet.Bouquet;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Bouquet bouquet = new Bouquet();
       // bouquet.getFlowerList().add(new Rose());
        bouquet.getFlowerList().get(0).setColor("red");
        System.out.println(bouquet.getFlowerList().get(0).getColor());

    }
}
