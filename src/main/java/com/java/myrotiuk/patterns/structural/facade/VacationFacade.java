package com.java.myrotiuk.patterns.structural.facade;

import java.time.LocalDate;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
public class VacationFacade {

    public void book(LocalDate start, LocalDate end){
        Flight flight = new Flight();
        flight.bookOutwardJourney(start);
        flight.bookReturnJourney(end);

        Hotel hotel = new Hotel();
        hotel.book(start, end);

        CarRental carRental = new CarRental();
        carRental.rent(start, end);

    }

}
