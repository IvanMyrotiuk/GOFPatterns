package com.java.myrotiuk.patterns.structural.proxy;

import java.util.List;
import java.util.Optional;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
public class InventoryProxy implements Inventory {

    private Inventory inventory;

    @Override
    public List<Item> getInvetory() {
        if (inventory == null){
            inventory = new SuperStoreInventory();
        }
        return inventory.getInvetory();
    }
}
