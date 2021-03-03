package com.java.myrotiuk.patterns.creational.prototype;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Ivan on 23.02.2021. All rights reserved.
 */
@Getter
@Setter
@Builder
@ToString
public class Student implements Cloneable {

    private String name;
    private Integer age;
    private StudentAddress address;

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.address = address.clone();
        return student;
    }

}
