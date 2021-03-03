package com.java.myrotiuk.patterns.structural.decorator;

import static java.lang.String.join;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 *
 * If we want to add some decoration to the cupcake that is inherited from Cake we need inherit it from PinkIcingCake
 * and further yet another interface SprinklesCake
 *
 * A cleaner solution would be include CupCake object into another object PinkIcingCake(CupCake) that adds the icing
 * this allows to change behaviour of cupCake object  without affecting other cupcake objects
 *  It also means that single responsibility principle is saved. The behaviour specific to pinkIcing is incupsulated inside
 *  pinkIcing Class instead of CupCake Class
 *
 *  We use Decorator pattern when we want to add additional responsibilities to an object dynamically
 *  The decorator patter is more flexible way of achieving this than subclassing
 *
 */
public class MyDecorator {
    public static void main(String[] args) {
        makeOrder(new PizzaHawaiian());
        makeOrder(new PizzaMargarita());
        makeOrder(new PizzaPepperoni());
        makeOrder(new ExtraCheesePizzaDecorator(new PizzaPepperoni()));
        makeOrder(new ExtraCaviarPizzaDecorator(new ExtraCheesePizzaDecorator(new PizzaPepperoni())));
        makeOrder(new ExtraCaviarPizzaDecorator(new PizzaPepperoni()));

    }

    private static void makeOrder(Pizza pizza){
        System.out.println(String.format("Pizza %s with such toppings: %s has been ordered",
                pizza.getName(), join(",", pizza.getToppingList())));
    }
}
