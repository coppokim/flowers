package com.epam.kim.service;

import com.epam.kim.entity.bouquet.Bouquet;

public class Printer {
    public static void print(Bouquet list){
        for (int i = 0; i<list.getFlowerList().size();i++){
            System.out.println(list.getFlowerList().get(i));
        }
    }
}
