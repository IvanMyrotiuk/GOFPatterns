package com.java.myrotiuk.patterns.behaviour.mediator;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 02.03.2021. All rights reserved.
 */
@AllArgsConstructor
public class Mediator {
    private Customer customer;
    private ECommerceSite eCommerceSite;
    private Driver driver;

    public void buy(String item, int quantity) {
        if (eCommerceSite.checkInStock(item, quantity)){
            eCommerceSite.sell(item, quantity);
            driver.deliver(item, quantity, customer);
        }
    }
}
