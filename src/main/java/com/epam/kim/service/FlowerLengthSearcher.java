package com.epam.kim.service;

import com.epam.kim.entity.bouquet.Bouquet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FlowerLengthSearcher {
    public static void filtrByLength(Bouquet list){
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("src\\main\\resources\\flowers.properties"));
            int minLength = Integer.parseInt(prop.getProperty("min-length"));
            int maxLength = Integer.parseInt(prop.getProperty("max-length"));
            for (int i = 0; i<list.getFlowerList().size();i++){
                if (list.getFlowerList().get(i).getLength() >= minLength && list.getFlowerList().get(i).getLength() <= maxLength)
                    System.out.println(list.getFlowerList().get(i));
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
