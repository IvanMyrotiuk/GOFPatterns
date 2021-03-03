package com.java.myrotiuk.patterns.behaviour.visitor;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public interface Employee {
    int getSalary();

    void accept(Visitor visitor);
}
