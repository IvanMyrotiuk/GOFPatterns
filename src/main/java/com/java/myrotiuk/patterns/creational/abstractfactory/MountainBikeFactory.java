package com.java.myrotiuk.patterns.creational.abstractfactory;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public class MountainBikeFactory implements BikeFactory {

    @Override
    public Tire createTire() {
        return new MountainTire();
    }

    @Override
    public HandleBar createHandleBar() {
        return new MountainHandleBar();
    }
}
