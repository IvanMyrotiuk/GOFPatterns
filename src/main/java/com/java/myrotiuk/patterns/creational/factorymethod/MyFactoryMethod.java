package com.java.myrotiuk.patterns.creational.factorymethod;

import java.util.List;

/**
 * Created by Ivan on 23.02.2021. All rights reserved.
 */
public class MyFactoryMethod {
    public static void main(String[] args) {

        Manufacture manufacture = new Manufacture();

        CandyFactory candyFactory = manufacture.getFactoryBySection(Section.CHOCOLATE);
        Candy candy = candyFactory.getCandy(CandyType.MILK);
        List<Candy> chocolateCandyList = candy.makeCandyPackage(11);

        CandyFactory hardCandyFactory = manufacture.getFactoryBySection(Section.HARD);
        Candy hardCandy = hardCandyFactory.getCandy(CandyType.LOLLIPOP);
        List<Candy> hardCandyList = hardCandy.makeCandyPackage(11);

        System.out.println("--------");
        candyFactory.getCandyPackage(11, CandyType.WHITE);
        hardCandyFactory.getCandyPackage(11, CandyType.CANDY_CANE);
    }
}
