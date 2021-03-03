package com.java.myrotiuk.patterns.creational.abstractfactory;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public interface BikeFactory {

    Tire createTire();

    HandleBar createHandleBar();

}
