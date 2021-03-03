package com.java.myrotiuk.patterns.behaviour.strategy;

import java.util.List;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
public interface Encryption {

    String encrypt(File file);

    List<Type> getTypes();

    default boolean apply(Type type){
        return getTypes().contains(type);
    }

}
