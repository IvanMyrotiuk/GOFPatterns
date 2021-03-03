package com.java.myrotiuk.patterns.behaviour.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public class StaffList implements Employee {

    private List<Employee> salaries = new ArrayList<>();
    {
        salaries.add(new Manager());
        salaries.add(new SalesPerson());
        salaries.add(new SalesPerson());
    }

    @Override
    public int getSalary() {
        return salaries.stream().mapToInt(Employee::getSalary).sum();
    }

    @Override
    public void accept(Visitor visitor) {
        salaries.forEach(e->e.accept(visitor));
        visitor.visit(this);
    }
}
