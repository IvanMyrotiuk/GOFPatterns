package com.java.myrotiuk.patterns.structural.decorator;

import java.util.List;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 */
public class ExtraCheesePizzaDecorator implements Pizza {

    private List<String> toppingList;
    private Pizza pizza;

    public ExtraCheesePizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
        toppingList = pizza.getToppingList();
        toppingList.add("Extra Cheese");
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public List<String> getToppingList() {
        return toppingList;
    }
}
