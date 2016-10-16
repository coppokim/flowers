package com.epam.kim.service;

import com.epam.kim.entity.flowers.Flower;
import com.epam.kim.entity.flowers.impl.Lily;
import com.epam.kim.entity.flowers.impl.Rose;
import com.epam.kim.entity.flowers.impl.Tulip;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FlowerBuilder {
    public static final int ROSE = 0;
    public static final int TULIP = 1;
    public static final int LILY = 2;


    public static Flower create(int type) {
        Properties prop = new Properties();
        int price = 0;
        int length = 0;
        String color = "";
        try {
            prop.load(new FileInputStream("src\\main\\resources\\flowers.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (type) {
            case ROSE:
                price = Integer.parseInt(prop.getProperty("price.rose"));
                length = Integer.parseInt(prop.getProperty("length.rose"));
                color = prop.getProperty("color.rose");
                return new Rose(price, length, color,Integer.parseInt(prop.getProperty("rose.thornsCount")));
            case TULIP:
                price = Integer.parseInt(prop.getProperty("price.tulip"));
                length = Integer.parseInt(prop.getProperty("length.tulip"));
                color = prop.getProperty("color.tulip");
                return new Tulip(price, length, color,Integer.parseInt(prop.getProperty("tulip.stolonCount")));
            case LILY:
                price = Integer.parseInt(prop.getProperty("price.lily"));
                length = Integer.parseInt(prop.getProperty("length.lily"));
                color = prop.getProperty("color.lily");
                return new Lily(price, length, color,Integer.parseInt(prop.getProperty("lily.scaleCount")));
            default:
                return null;
        }
    }
}
