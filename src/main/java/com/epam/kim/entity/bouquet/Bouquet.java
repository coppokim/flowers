package com.epam.kim.entity.bouquet;

import com.epam.kim.FlowerBuilder;
import com.epam.kim.entity.wrapper.Wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bouquet {
    private List<FlowerBuilder> flowerList = new ArrayList<FlowerBuilder>();
    private Wrapper wrapper;

    public void addFlower(int flowerCount) {
        Random random = new Random();
        for (int i = 0; i < flowerCount; i++)
            this.flowerList.add(FlowerBuilder.create(random.nextInt(3)));
    }

    public List<FlowerBuilder> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<FlowerBuilder> flowerList) {
        this.flowerList = flowerList;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

}
