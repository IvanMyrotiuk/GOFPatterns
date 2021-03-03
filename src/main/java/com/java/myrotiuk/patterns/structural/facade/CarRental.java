package com.java.myrotiuk.patterns.structural.facade;

import java.time.LocalDate;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
public class CarRental {

    public void rent(LocalDate checkinDate, LocalDate checkoutDate){
        System.out.println(String.format("Rent car for %s to %s", checkinDate, checkoutDate));
    }
}
