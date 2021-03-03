package com.java.myrotiuk.patterns.behaviour.visitor;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public class EmployeeVisitor implements Visitor {

    @Override
    public void visit(Manager manager) {
        manager.setSalary(30000);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(70000);
    }

    @Override
    public void visit(StaffList staffList) {
        System.out.println("We are making changes to the employees");
    }
}
