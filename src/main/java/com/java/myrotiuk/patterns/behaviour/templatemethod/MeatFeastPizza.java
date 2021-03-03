package com.java.myrotiuk.patterns.behaviour.templatemethod;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public class MeatFeastPizza extends Pizza{

    @Override
    public void addToppings(){
        super.addToppings();
        System.out.println("Add papperoni");
        System.out.println("Add hum");
        System.out.println("Add chicken");
    }

    @Override
    public void cook() {
        System.out.println("Cook in the oven for 20 min");
    }
}
