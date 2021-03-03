package com.java.myrotiuk.patterns.behaviour.templatemethod;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 * Defining common steps and algorithms and a superclass and redefining some of those steps in a subclass.
 * You only want to implement the common parts of an algorithm once
 * If we have classes that duplicate the same code we may consider refactor and create abstract class
 */
public class MyTemplateMethod {
    public static void main(String[] args) {
        Pizza meatPizza = new MeatFeastPizza();
        Pizza vegPizza = new VegetarianPizza();
        meatPizza.printInstructions();
        System.out.println();
        vegPizza.printInstructions();
    }
}
