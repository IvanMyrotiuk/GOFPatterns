package com.java.myrotiuk.patterns.creational.builder;

/**
 * Created by Ivan on 22.02.2021. All rights reserved.
 */
public class MyBuilder {
    public static void main(String[] args) {
        House house = House.builder()
                .name("Paradise")
                .numberOfWindow(27)
                .high(10.1)
                .length(700.5)
                .width(500.3)
                .build();
        System.out.println(house);
    }
}
