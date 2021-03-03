package com.java.myrotiuk.patterns.behaviour.visitor;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public interface Visitor {

    void visit(Manager manager);

    void visit(SalesPerson salesPerson);

    void visit(StaffList staffList);

}
