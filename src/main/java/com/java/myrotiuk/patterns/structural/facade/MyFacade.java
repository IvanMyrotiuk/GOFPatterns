package com.java.myrotiuk.patterns.structural.facade;

import java.time.LocalDate;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 * <p>
 * App has lots of complex functionality  and we want to hide those complexity under interface so it easier to use
 * Operating system on PC or phone when we click on a button to open an app on your phone you do not see all the work
 * which operation system is doing on background.
 * All you see that you click on the button and app is opened on your screen.
 * Easier to use complex code
 * Promotes loose coupling
 * VacationClient
 */
public class MyFacade {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2021, 8, 15);//LocalDate.parse("2021-08-30", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate end = LocalDate.of(2021, 9, 15);

        VacationFacade vacation = new VacationFacade();
        vacation.book(start, end);
    }
}
