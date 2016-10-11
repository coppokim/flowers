package com.epam.kim;


import com.epam.kim.entity.flowers.impl.rose.Rose;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        Rose rose = new Rose();
        rose.setColor("green");

        System.out.println(rose.getColor());
    }
}
