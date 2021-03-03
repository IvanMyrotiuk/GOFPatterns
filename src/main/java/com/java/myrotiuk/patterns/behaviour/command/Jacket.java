package com.java.myrotiuk.patterns.behaviour.command;

/**
 * Created by Ivan on 27.02.2021. All rights reserved.
 */
public class Jacket implements Order{

    @Override
    public void buyOrder(){
        System.out.println("You have bought jacket");
    }

    @Override
    public void returnOrder(){
        System.out.println("You have return your jacket...");
    }
}
