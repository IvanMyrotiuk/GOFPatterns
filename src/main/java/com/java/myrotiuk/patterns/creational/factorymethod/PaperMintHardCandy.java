package com.java.myrotiuk.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 24.02.2021. All rights reserved.
 */
public class PaperMintHardCandy extends Candy {

    @Override
    public List<Candy> makeCandyPackage(int quantity) {
        List<Candy> hardCandyList = new ArrayList<>();
        for (int i = 0; i < quantity; i++){
            hardCandyList.add(new PaperMintHardCandy());
        }
        System.out.println("One package of " + quantity + " paper mint has been made!");
        return hardCandyList;
    }
}
