package com.epam.kim;


import com.epam.kim.entity.bouquet.Bouquet;
import com.epam.kim.entity.wrapper.Wrapper;
import com.epam.kim.service.FlowerDateOfBuyingComporator;
import com.epam.kim.service.FlowerLengthSearcher;
import com.epam.kim.service.Printer;

import java.text.ParseException;
import java.util.Collections;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) throws ParseException {
        Logger log = Logger.getLogger(Main.class.getName());

        int flowerCount =5;
        Bouquet bouquet = new Bouquet();
        Wrapper wrapper = new Wrapper();
        wrapper.setPriceAndMaterials();
        bouquet.setWrapper(wrapper);
        bouquet.addFlower(flowerCount);
        Printer.print(bouquet);
        Collections.sort(bouquet.getFlowerList(), new FlowerDateOfBuyingComporator());
        log.info("--------------- sorted by date of buying--------------------");
        //System.out.println();
        log.info(bouquet.toString());
        log.info("--------------- filtred by length----------------------------");
        FlowerLengthSearcher.filtrByLength(bouquet);
        log.info("----------------Price of bouqet------------------------------");
        log.info(bouquet.getWrapper().toString());
        log.info("bouquet's price = " + bouquet.getPrice());
    }
}
