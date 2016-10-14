package com.epam.kim;


import com.epam.kim.entity.bouquet.Bouquet;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Bouquet bouquet = new Bouquet();
       // bouquet.getFlowerList().add(new Rose());
        bouquet.addFlower(10);
 //       bouquet.getFlowerList().get(0).setColor("red");
//        for (int i=0;i<10; i++)
        System.out.println(bouquet.getFlowerList());

    }
}
