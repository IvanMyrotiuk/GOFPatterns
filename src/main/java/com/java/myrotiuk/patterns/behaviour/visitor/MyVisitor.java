package com.java.myrotiuk.patterns.behaviour.visitor;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 * <p>
 * Image someone wants to perform salary adjustment on each different type of stuff member.
 * Say for example they want to increase all managers salary to 65,000 and all salespeople to 57,000.
 * We should implement visitor pattern so each type of employee can be adjusted differently.
 * Without putting the code for adjustment salaries in those classes.
 *
 * The visitor pattern is best used when the elements to be visited are unlikely to change
 * When additions are amde to the group of elements, all of the visitor implementations need to be updated too.
 */
public class MyVisitor {
    public static void main(String[] args) {
        Employee employee = new StaffList();
        System.out.println("Total amount paid to staff " + employee.getSalary());
        employee.accept(new EmployeeVisitor());
        System.out.println("New total amount paid to staff " + employee.getSalary());
    }
}
