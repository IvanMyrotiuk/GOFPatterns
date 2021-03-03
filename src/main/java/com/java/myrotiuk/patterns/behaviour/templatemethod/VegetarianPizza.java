package com.java.myrotiuk.patterns.behaviour.templatemethod;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public class VegetarianPizza extends Pizza{

    @Override
    public void addToppings(){
        super.addToppings();
        System.out.println("Add peppers");
        System.out.println("Add olive");
    }

    @Override
    public void cook() {
        System.out.println("Cook in the oven for 15 min");
    }
}
