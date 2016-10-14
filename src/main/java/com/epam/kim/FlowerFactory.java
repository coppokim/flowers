package com.epam.kim;

import com.epam.kim.entity.flowers.Flower;
import com.epam.kim.entity.flowers.impl.lily.Lily;
import com.epam.kim.entity.flowers.impl.rose.Rose;
import com.epam.kim.entity.flowers.impl.tulip.Tulip;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FlowerFactory {
    public static final int ROSE = 0;
    public static final int TULIP = 1;
    public static final int LILY = 2;


    public static Flower create(int type) {
        Properties prop = new Properties();
        int price=0;
        int length=0;
        String color="";
        try {
            prop.load(new FileInputStream("src\\main\\resources\\flowers.properties"));

            switch (type){
                case ROSE:
                    price = Integer.parseInt(prop.getProperty("price.rose"));
                case TULIP:
                    price = Integer.parseInt(prop.getProperty("price.tulip"));
                default:
                    price = Integer.parseInt(prop.getProperty("price.lily"));
            }
            switch (type){
                case ROSE:
                    length = Integer.parseInt(prop.getProperty("length.rose"));
                case TULIP:
                    length = Integer.parseInt(prop.getProperty("length.tulip"));
                default:
                    length = Integer.parseInt(prop.getProperty("length.lily"));
            }
            switch (type){
                case ROSE:
                    color = prop.getProperty("color.rose");
                case TULIP:
                    color = prop.getProperty("color.tulip");
                default:
                    color = prop.getProperty("color.lily");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (type) {
            case ROSE:
                return new Rose(price, length, color);
            case TULIP:
                return new Tulip(price, length, color);
            default:
                return new Lily(price,length,color);
        }
    }
}
