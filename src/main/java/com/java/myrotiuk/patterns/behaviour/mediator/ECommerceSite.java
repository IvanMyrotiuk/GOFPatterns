package com.java.myrotiuk.patterns.behaviour.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivan on 02.03.2021. All rights reserved.
 */
public class ECommerceSite {

    private Map<String, Integer> stock = new HashMap<>();

    {
        stock.put("pens", 100);
        stock.put("pencils", 50);
        stock.put("erasers", 75);
    }

    public boolean checkInStock(String item, Integer quantity) {
        return stock.containsKey(item) && stock.get(item) >= quantity;
    }

    public void sell(String item, Integer quantity) {
        int newQuantity = stock.get(item) - quantity;
        stock.put(item, newQuantity);
    }


}
