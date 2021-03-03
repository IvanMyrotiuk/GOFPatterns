package com.java.myrotiuk.patterns.creational.factorymethod;

import java.util.Collections;
import java.util.List;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public class HardCandyFactory extends CandyFactory {
    @Override
    public Candy getCandy(CandyType candyType) {
        switch (candyType){
            case LOLLIPOP: return new LollipopHardCandy();
            case CANDY_CANE: return new CaneHardCandy();
            case PEPPER_MINT: return new PaperMintHardCandy();
            default:
                throw new IllegalArgumentException("Wrong hard candy type: " + candyType);
        }
    }

    @Override
    public List<Candy> getCandyPackage(int quantity, CandyType candyType) {
        Candy candy = getCandy(candyType);
        if (quantity % 10 != 0){
            System.out.println("Quantity for hard candy should be packaged in multiples of 10.");
            return Collections.emptyList();
        }
        return candy.makeCandyPackage(quantity);
    }
}
