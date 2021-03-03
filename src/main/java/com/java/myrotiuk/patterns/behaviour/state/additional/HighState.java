package com.java.myrotiuk.patterns.behaviour.state.additional;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public class HighState implements FanState {
    @Override
    public void turnUp(Fan fan) {

    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is on medium speed");
    }
}
