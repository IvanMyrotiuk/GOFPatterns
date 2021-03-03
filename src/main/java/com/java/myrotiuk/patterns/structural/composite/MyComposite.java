package com.java.myrotiuk.patterns.structural.composite;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 *
 * Group of object can be treated as an individual object.
 * This is called composite.
 *
 */
public class MyComposite {

    public static void main(String[] args) {

        Manager manager = new Manager("Johnson");
        SalesPerson lilu = new SalesPerson("Lilu", manager);
        SalesPerson julia = new SalesPerson("Julia", manager);

        SalesTeam salesTeam = new SalesTeam();
        salesTeam.addPayee(manager);
        salesTeam.addPayee(lilu);
        salesTeam.addPayee(julia);

        payEmployeeExpenses(manager, 100d);
        payEmployeeExpenses(salesTeam, 200d);
        payEmployeeExpenses(julia, 200d);
        payEmployeeExpenses(lilu, 200d);
    }

    private static void payEmployeeExpenses(Payee payee, Double expenses){
        System.out.println("Expenses have been requested");
        payee.payExpenses(expenses);
        System.out.println("Expenses have been paid");
    }

}
