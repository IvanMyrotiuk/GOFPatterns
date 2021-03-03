package com.java.myrotiuk.patterns.creational.factorymethod;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public class ChocolateCandyFactory extends CandyFactory {
    @Override
    public Candy getCandy(CandyType candyType) {
        switch (candyType){
            case DARK: return new BlackChocolate();
            case MILK: return new MilkChocolate();
            case WHITE: return new WhiteChocolate();
            default:
                throw new IllegalArgumentException("Wrong chocolate candy type: " + candyType);
        }
    }
}
