package com.java.myrotiuk.patterns.behaviour.state.additional;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public class MyState {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnUp();
        fan.turnUp();
        fan.turnDown();
        fan.turnDown();
    }
}
