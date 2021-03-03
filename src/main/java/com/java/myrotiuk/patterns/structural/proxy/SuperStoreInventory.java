package com.java.myrotiuk.patterns.structural.proxy;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
@NoArgsConstructor
public class SuperStoreInventory implements Inventory{

    private List<Item> inventory = new ArrayList<>();
    {
        //might load from DB costy operation !!!!
        inventory.add(new Item("Bread", 1, 500));
        inventory.add(new Item("Milk", 0.5, 400));
        inventory.add(new Item("Eggs", 0.7, 300));
        inventory.add(new Item("Coffee", 4, 100));
        inventory.add(new Item("Ham", 2, 300));
        inventory.add(new Item("Orange juice", 1, 400));
        inventory.add(new Item("Cereal", 0.3, 400));
        inventory.add(new Item("Pasta", 1, 300));
        inventory.add(new Item("Appples", 0.2, 300));
        inventory.add(new Item("Bananas", 0.1, 200));
    }

    @Override
    public List<Item> getInvetory() {
        return inventory;
    }
}
