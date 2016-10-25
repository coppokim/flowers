package com.epam.kim.service;

import com.epam.kim.entity.bouquet.Bouquet;

import java.util.logging.Logger;

public class Printer {
    public static void print(Bouquet list){
        Logger log = Logger.getLogger(Printer.class.getName());
        for (int i = 0; i<list.getFlowerList().size();i++){
            log.info(String.valueOf(list.getFlowerList().get(i)));
        }
    }
}
