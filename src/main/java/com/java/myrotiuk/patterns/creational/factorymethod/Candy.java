package com.java.myrotiuk.patterns.creational.factorymethod;

import java.util.List;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public abstract class Candy {

    public abstract List<Candy> makeCandyPackage(int quantity);

}
