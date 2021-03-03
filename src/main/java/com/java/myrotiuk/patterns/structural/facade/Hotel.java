package com.java.myrotiuk.patterns.structural.facade;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
public class Hotel {

    public void book(LocalDate checkinDate, LocalDate checkoutDate){
        System.out.println(String.format("Booking hotel for %s to %s", checkinDate, checkoutDate));
    }
}
