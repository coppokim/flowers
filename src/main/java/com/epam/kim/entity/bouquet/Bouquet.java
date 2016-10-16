package com.epam.kim.entity.bouquet;

import com.epam.kim.service.FlowerBuilder;
import com.epam.kim.entity.flowers.Flower;
import com.epam.kim.entity.wrapper.Wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bouquet {
    private List<Flower> flowerList = new ArrayList<>();
    private Wrapper wrapper;

    public void addFlower(int flowerCount) {
        Random random = new Random();
        for (int i = 0; i < flowerCount; i++)
            this.flowerList.add(FlowerBuilder.create(random.nextInt(3)));
    }
    public int getPrice(){
        int k=0;
        for (int i=0; i<this.getFlowerList().size(); i++){
            k += this.getFlowerList().get(i).getPrice();
        }
        k += this.wrapper.getPrice();
        return k;
    }
    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowerList=" + flowerList +
                ", wrapper=" + wrapper +
                '}';
    }
}
