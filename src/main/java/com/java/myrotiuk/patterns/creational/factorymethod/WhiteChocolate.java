package com.java.myrotiuk.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public class WhiteChocolate extends Candy {

    @Override
    public List<Candy> makeCandyPackage(int quantity) {
        List<Candy> chocolateList = new ArrayList<>();
        for (int i = 0; i < quantity; i++){
            chocolateList.add(new WhiteChocolate());
        }
        System.out.println("One package of " + quantity + " white chocolates has been made!");
        return chocolateList;
    }
}
