package com.epam.kim.entity.bouquet;

import com.epam.kim.entity.flowers.Flower;
import com.epam.kim.entity.wrapper.Wrapper;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowerList = new ArrayList<Flower>();
    private Wrapper wrapper;

    public void addFlower(Flower flower, int flowerCount){
        for (int i=0;i<flowerCount;i++)
        this.flowerList.add(flower);
    }
    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

}
