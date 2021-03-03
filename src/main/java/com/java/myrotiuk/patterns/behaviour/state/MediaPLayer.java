package com.java.myrotiuk.patterns.behaviour.state;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
@Getter
@Setter
public class MediaPLayer {

    private State state = new PausedState();
    private String icon = "play button";


    public void play(){
        state.play(this);
    }

    public void pause(){
        state.pause(this);
    }

    public void forward(){
        state.forward(this);
    }

}
