package com.java.myrotiuk.patterns.structural.adapter;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 *
 * If we want to use a class that belongs to the third party app but it does not fit with your app
 * because of incompatible interfaces
 * The adapter pattern allow classes to work together that normally wouldn't be able to.
 *
 * You want to use an existing class, and it doesn't fit into your hierarchy
 *
 */
public class MyAdapter {
    public static void main(String[] args) {

        CarPriceCalculator carPriceCalculator = new CarPriceCalculator(2, 2);
        TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(1, 3);
        PricePrinter.printVehiclePrice(carPriceCalculator);
        PricePrinter.printVehiclePrice(truckPriceCalculator);

        UkCarPriceCalculator ukCarPriceCalculator = new UkCarPriceCalculator(40000.0);
        PriceCalculatorAdapter priceCalculatorAdapter = new PriceCalculatorAdapter(ukCarPriceCalculator);
        PricePrinter.printVehiclePrice(priceCalculatorAdapter);

    }
}
