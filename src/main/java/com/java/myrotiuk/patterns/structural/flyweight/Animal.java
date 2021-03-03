package com.java.myrotiuk.patterns.structural.flyweight;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
public interface Animal {

    String getAnimalType();

    int[] getLocation();

    void setLocation(int latitude, int longitude);
}
