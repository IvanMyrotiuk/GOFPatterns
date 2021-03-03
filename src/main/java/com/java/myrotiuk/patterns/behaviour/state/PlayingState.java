package com.java.myrotiuk.patterns.behaviour.state;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public class PlayingState implements State {
    @Override
    public void pause(MediaPLayer mediaPLayer) {
        mediaPLayer.setState(new PausedState());
        mediaPLayer.setIcon("Play button");
        System.out.println("Video is paused and icon is set to " + mediaPLayer.getIcon());
    }

    @Override
    public void play(MediaPLayer mediaPLayer) {

    }

    @Override
    public void forward(MediaPLayer mediaPLayer) {
        mediaPLayer.setState(new ForwardState());
        mediaPLayer.setIcon("Play button");
        System.out.println("Video forwarding, icon is set to " + mediaPLayer.getIcon());
    }
}
