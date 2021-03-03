package com.java.myrotiuk.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 25.02.2021. All rights reserved.
 */
public class SalesTeam implements Payee{

    private List<Payee> payeeList = new ArrayList<>();
//    private List<Manager> managerList = new ArrayList<>();
//    private List<SalesPerson> salesPersonList = new ArrayList<>();

    public void addPayee(Payee payee) {
        payeeList.add(payee);
    }
//    public void addManager(Manager manager) {
//        managerList.add(manager);
//    }
//
//    public void addSalesPerson(SalesPerson salesPerson) {
//        salesPersonList.add(salesPerson);
//    }

    @Override
    public void payExpenses(Double expenses) {
        payeeList.forEach(e -> e.payExpenses(expenses));
//        managerList.forEach(e -> e.payExpenses(expenses));
//        salesPersonList.forEach(e -> e.payExpenses(expenses));
    }
}
