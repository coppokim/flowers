package com.epam.kim;


import com.epam.kim.entity.bouquet.Bouquet;
import com.epam.kim.entity.wrapper.Wrapper;
import com.epam.kim.service.FlowerDateOfBuyingComporator;
import com.epam.kim.service.FlowerLengthSearcher;
import com.epam.kim.service.Printer;

import java.text.ParseException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws ParseException {
        int flowerCount =5;
        Bouquet bouquet = new Bouquet();
        Wrapper wrapper = new Wrapper();
        wrapper.setPriceAndMaterials();
        bouquet.setWrapper(wrapper);
        bouquet.addFlower(flowerCount);
        Printer.print(bouquet);
        Collections.sort(bouquet.getFlowerList(), new FlowerDateOfBuyingComporator());
        System.out.println("--------------- sorted by date of buying--------------------");
        Printer.print(bouquet);
        System.out.println("--------------- filtred by length----------------------------");
        FlowerLengthSearcher.filtrByLength(bouquet);
        System.out.println("----------------Price of bouqet------------------------------");
        System.out.println(bouquet.getWrapper());
        System.out.println("bouquet's price = "+bouquet.getPrice());

    }
}
