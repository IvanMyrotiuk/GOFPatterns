package com.java.myrotiuk.patterns.structural.proxy;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
@AllArgsConstructor
public class Store {
    private String name;
    private String location;
    private Inventory inventory;

    public void printName(){
        System.out.println(name);
    }

    public void printLocation(){
        System.out.println(location);
    }

    public void printInventory(){
        inventory.getInvetory()
                .forEach(System.out::println);
    }


}
