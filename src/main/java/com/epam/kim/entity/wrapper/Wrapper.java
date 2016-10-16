package com.epam.kim.entity.wrapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class Wrapper {
    private String material;
    private int price;

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public void setPriceAndMaterials() {
        try {
            Random random = new Random();
            Properties prop = new Properties();
            prop.load(new FileInputStream("src\\main\\resources\\wrapper.properties"));
            switch (random.nextInt(4)){
                case 0:
                    this.price= Integer.parseInt(prop.getProperty("paper"));
                    this.material="paper";
                case 1:
                    this.price= Integer.parseInt(prop.getProperty("net"));
                    this.material="net";
                case 2:
                    this.price= Integer.parseInt(prop.getProperty("foil"));
                    this.material="foil";
                default:
                    this.price= Integer.parseInt(prop.getProperty("gold.foil"));
                    this.material="gold.foil";
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
