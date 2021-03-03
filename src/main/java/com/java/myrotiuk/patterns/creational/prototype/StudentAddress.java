package com.java.myrotiuk.patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Ivan on 23.02.2021. All rights reserved.
 */
@AllArgsConstructor
@ToString
@Setter
public class StudentAddress implements Cloneable{
    private String address;

    @Override
    public StudentAddress clone() throws CloneNotSupportedException {
        return (StudentAddress) super.clone();
    }
}
