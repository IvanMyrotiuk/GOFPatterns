package com.java.myrotiuk.patterns.structural.adapter;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 */
public class PricePrinter {

    public static void printVehiclePrice(PriceCalculator priceCalculator){
        System.out.println("The price of vehicle is: " + priceCalculator.calculatePrice());
    }

}
