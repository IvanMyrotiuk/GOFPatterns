package com.java.myrotiuk.patterns.structural.adapter;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 */
@AllArgsConstructor
public class CarPriceCalculator implements PriceCalculator {

    private Integer age;
    private Integer miles;

    @Override
    public double calculatePrice() {
        return miles/age * 100;
    }
}
