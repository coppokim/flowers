package com.epam.kim.entity.bouquet;

import com.epam.kim.entity.flowers.Flower;
import com.epam.kim.entity.wrapper.Wrapper;

public class Bouquet {
    public Flower flower [];
    public Wrapper wrapper;

    public int bouqetPrice(){
        int k=0;
        for (int i=0;i<flower.length;i++){
            k+=flower[i].getPrice();
        }
        k+=wrapper.getPrice();
        return k;
    }
}
