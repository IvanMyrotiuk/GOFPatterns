package com.java.myrotiuk.patterns.behaviour.state;

/**
 * Created by Ivan on 02.03.2021. All rights reserved.
 *
 * Sometimes we need our object behaves differently depending on its internal states.
 *
 * The state pattern allows the object to alter its behaviour when its state changes.
 * Is a way of avoiding large if/else blocks or switch statements
 * Allows an object to change its behavior when its internal state changes
 *
 */
public class MyState {
    public static void main(String[] args) {
        MediaPLayer mediaPLayer = new MediaPLayer();
        mediaPLayer.pause();
        mediaPLayer.play();
        mediaPLayer.play();
        mediaPLayer.pause();
    }
}
