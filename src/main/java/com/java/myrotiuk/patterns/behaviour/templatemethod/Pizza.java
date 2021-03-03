package com.java.myrotiuk.patterns.behaviour.templatemethod;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public abstract class Pizza {

    public void makeBase(){
        System.out.println("Miz flour, yeast, and salt");
        System.out.println("Roll out the dough");
    }

    public void addToppings(){
        System.out.println("Add tomato");
        System.out.println("Add cheese");
    }

    public abstract void cook();

    public void printInstructions(){
        makeBase();
        addToppings();
        cook();
    }
}
