package com.java.myrotiuk.patterns.creational.factorymethod;

import java.util.List;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public abstract class CandyFactory {

    public abstract Candy getCandy(CandyType candyType);

    public List<Candy> getCandyPackage(int quantity, CandyType candyType){
        Candy candy = getCandy(candyType);
        return candy.makeCandyPackage(quantity);
    }

}
