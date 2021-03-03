package com.java.myrotiuk.patterns.creational.abstractfactory;

/**
 * Created by Ivan on 23.02.2021. All rights reserved.
 * <p>
 * Abstract factory provides an interface for creating families of objects without specifying what their
 * concrete types are. How objects are created should be hidden from view.
 */
public class MyAbstractFactory {
    public static void main(String[] args) {
        FactoryCreator factoryCreator = new FactoryCreator();
        BikeFactory mountainBikeFactory = factoryCreator.createFactory(FactoryType.MOUNTAIN);
        BikeFactory roadBikeFactory = factoryCreator.createFactory(FactoryType.ROAD);

        Tire mountainBikeTire = mountainBikeFactory.createTire();
        HandleBar mountainBikeHandleBar = mountainBikeFactory.createHandleBar();
        System.out.println("mountain bike tire: " + mountainBikeTire.getDescription());
        System.out.println("mountain bike handle bar: " + mountainBikeHandleBar.getDescription());

        Tire roadTire = roadBikeFactory.createTire();
        HandleBar roadHandleBar = roadBikeFactory.createHandleBar();

        System.out.println("road bike tire: " + roadTire.getDescription());
        System.out.println("road bike handle bar: " + roadHandleBar.getDescription());

    }
}
