package com.java.myrotiuk.patterns.structural.facade;

import java.time.LocalDate;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
public class Flight {

    public void bookOutwardJourney(LocalDate start){
        System.out.println("Outbound flight booked for " + start);
    }

    public void bookReturnJourney(LocalDate end){
        System.out.println("Return flight booked for " + end);
    }

}
