package com.java.myrotiuk.patterns.structural.decorator;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 */
@Getter
public class PizzaHawaiian implements Pizza {

    private List<String> toppingList = new ArrayList<>();
    private String name = "Hawaiian";

    {
        toppingList.add("cheese");
        toppingList.add("tomato");
        toppingList.add("ham");
        toppingList.add("pineapple");
    }

}
