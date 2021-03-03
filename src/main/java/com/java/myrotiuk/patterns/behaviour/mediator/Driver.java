package com.java.myrotiuk.patterns.behaviour.mediator;

/**
 * Created by Ivan on 02.03.2021. All rights reserved.
 */
public class Driver {

    public void deliver(String item, Integer quantity, Customer customer) {
        System.out.println(String.format("%d %s out for delivery to %s", quantity, item, customer.getAddress()));
    }

}
