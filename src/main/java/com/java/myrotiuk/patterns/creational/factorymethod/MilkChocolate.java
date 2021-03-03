package com.java.myrotiuk.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public class MilkChocolate extends Candy {

    @Override
    public List<Candy> makeCandyPackage(int quantity) {
        List<Candy> chocolateList = new ArrayList<>();
        for (int i = 0; i < quantity; i++){
            chocolateList.add(new MilkChocolate());
        }
        System.out.println("One package of " + quantity + " milk chocolates has been made!");
        return chocolateList;
    }
}
