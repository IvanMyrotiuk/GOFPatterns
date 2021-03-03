package com.java.myrotiuk.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 */
public class AnimalFactory {

    private Map<Integer, Animal> animalMap = new HashMap<>();

    public Animal getAnimal(Integer type) {
        return Optional.ofNullable(animalMap.get(type))
                .orElseGet(() -> this.createAnimal(type));
    }

    private Animal createAnimal(Integer type) {
        Animal animal = type == 0 ? new Lion() : new Tiger();
        animalMap.put(type, animal);
        return animal;
    }

}
