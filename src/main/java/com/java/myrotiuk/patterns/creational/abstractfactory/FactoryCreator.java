package com.java.myrotiuk.patterns.creational.abstractfactory;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public class FactoryCreator {

    public BikeFactory createFactory(FactoryType factoryType) {
        switch (factoryType) {
            case ROAD:
                return new RoadBikeFactory();
            case MOUNTAIN:
                return new MountainBikeFactory();
            default:
                throw new IllegalArgumentException("Wrong factory type: " + factoryType);
        }
    }

}
