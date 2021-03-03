package com.java.myrotiuk.patterns.behaviour.state.additional;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
@Getter
@Setter
public class Fan {

    private FanState state = new LowState();

    public void turnUp(){
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }
}
