package com.java.myrotiuk.patterns.behaviour.state;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public interface State {

    void pause(MediaPLayer mediaPLayer);

    void play(MediaPLayer mediaPLayer);

    void forward(MediaPLayer mediaPLayer);

}
