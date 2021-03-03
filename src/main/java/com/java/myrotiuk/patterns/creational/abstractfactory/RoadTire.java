package com.java.myrotiuk.patterns.creational.abstractfactory;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public class RoadTire implements Tire {
    @Override
    public String getDescription() {
        return "Created tire for road bike";
    }
}
