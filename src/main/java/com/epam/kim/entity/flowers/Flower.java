package com.epam.kim.entity.flowers;

public abstract class Flower {
    private int price;
    private int length;
    private String color;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public boolean equals(Object obj)
//    {
//        if(obj == this)
//            return true;
//
//     /* obj ссылается на null */
//
//        if(obj == null)
//            return false;
//
//     /* Удостоверимся, что ссылки имеют тот же самый тип */
//
//        if(!(getClass() == obj.getClass()))
//            return false;
//        else
//        {
//            Flower flower = (Flower)obj;
//            if(flower.student_id == this.student_id)
//                return true;
//            else
//                return false;
//        }
//    }
}
