package com.java.myrotiuk.patterns.creational.prototype;

/**
 * Created by Ivan on 23.02.2021. All rights reserved.
 */
public class MyPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        StudentAddress address = new StudentAddress("Hills");
        Student student = Student.builder()
                .name("John")
                .age(31)
                .address(address)
                .build();

        Student studentPrototype = student.clone();

        address.setAddress("California");

        System.out.println("origin student " + student);
        System.out.println("prototype student " + studentPrototype);
    }
}
