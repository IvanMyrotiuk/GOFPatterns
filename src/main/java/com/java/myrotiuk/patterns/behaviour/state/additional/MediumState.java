package com.java.myrotiuk.patterns.behaviour.state.additional;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public class MediumState implements FanState {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new HighState());
        System.out.println("Fan is on high speed");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new LowState());
        System.out.println("Fan is on low speed");
    }
}
