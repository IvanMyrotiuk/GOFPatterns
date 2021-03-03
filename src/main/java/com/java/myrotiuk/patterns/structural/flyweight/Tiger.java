package com.java.myrotiuk.patterns.structural.flyweight;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
public class Tiger implements Animal {

    private int[] location = new int[2];

    @Override
    public String getAnimalType() {
        return "Tiger";
    }

    @Override
    public int[] getLocation() {
        return location;
    }

    @Override
    public void setLocation(int latitude, int longitude) {
        location[0] = latitude;
        location[1] = longitude;
    }
}
