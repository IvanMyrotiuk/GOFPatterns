package com.java.myrotiuk.patterns.structural.composite;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 */
@AllArgsConstructor
public class SalesPerson implements Payee{

    private String name;
    private Manager manager;

    @Override
    public void payExpenses(Double expenses){
        System.out.println(String.format("Sales person %s has been paid such amount of expenses: %.3f", name, expenses));
    }

}
