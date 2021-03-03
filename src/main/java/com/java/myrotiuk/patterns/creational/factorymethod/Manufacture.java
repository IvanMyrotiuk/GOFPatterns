package com.java.myrotiuk.patterns.creational.factorymethod;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public class Manufacture {

    public CandyFactory getFactoryBySection(Section section) {
        switch (section) {
            case CHOCOLATE:
                return new ChocolateCandyFactory();
            case HARD:
                return new HardCandyFactory();
            default:
                throw new IllegalArgumentException("Wrong candy factory: " + section);
        }
    }

}
