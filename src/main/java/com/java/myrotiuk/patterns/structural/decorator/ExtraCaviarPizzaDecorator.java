package com.java.myrotiuk.patterns.structural.decorator;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 */
@AllArgsConstructor
public class ExtraCaviarPizzaDecorator implements Pizza {

    private Pizza pizza;

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public List<String> getToppingList() {
        List<String> toppingList = pizza.getToppingList();
        toppingList.add("ExtraCaviar");
        return toppingList;
    }
}
