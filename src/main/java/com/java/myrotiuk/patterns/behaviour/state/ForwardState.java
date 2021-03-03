package com.java.myrotiuk.patterns.behaviour.state;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public class ForwardState implements State {

    @Override
    public void pause(MediaPLayer mediaPLayer) {
        mediaPLayer.setState(new PausedState());
        mediaPLayer.setIcon("play button");
        System.out.println("Video paused, icon is set to " + mediaPLayer.getIcon());
    }

    @Override
    public void play(MediaPLayer mediaPLayer) {
        mediaPLayer.setState(new PlayingState());
        mediaPLayer.setIcon("pause button");
        System.out.println("Video playing, icon is set to " + mediaPLayer.getIcon());
    }

    @Override
    public void forward(MediaPLayer mediaPLayer) {

    }
}
