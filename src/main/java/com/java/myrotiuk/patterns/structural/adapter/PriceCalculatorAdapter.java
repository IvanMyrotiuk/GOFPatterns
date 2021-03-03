package com.java.myrotiuk.patterns.structural.adapter;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 */
@AllArgsConstructor
public class PriceCalculatorAdapter implements PriceCalculator {

    private UkCarPriceCalculator ukCarPriceCalculator;

    @Override
    public double calculatePrice() {
        return ukCarPriceCalculator.getPrice() + 10000;
    }
}
