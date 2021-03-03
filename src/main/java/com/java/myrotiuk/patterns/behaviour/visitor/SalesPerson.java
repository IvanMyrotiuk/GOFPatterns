package com.java.myrotiuk.patterns.behaviour.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
@Getter
@Setter
public class SalesPerson implements Employee {

    private int salary = 50000;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
