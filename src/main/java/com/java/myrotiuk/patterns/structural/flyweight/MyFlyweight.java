package com.java.myrotiuk.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 *
 * Suppose we have got hundreds of small objects in your app that use uploads of memory.
 * Flyweight pattern uses sharing to make apps like these work more efficiently.
 *
 * Flyweight object should behave as it is not shared. We should be able to use it multiple places at the same time
 * as they were separate objects
 * we are using much less memory by reusing our objects fom cash that are similar at our app
 *
 * Animal Population simulation
 */
public class MyFlyweight {

    private static List<Animal> animalList = new ArrayList<>();
    private static AnimalFactory animalFactory = new AnimalFactory();

    public static void main(String[] args) {

        Runnable createAnimal = MyFlyweight::createRundomAnimal;
        Runnable removeAnimal = MyFlyweight::removeAnimal;

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(createAnimal, 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(removeAnimal, 5, 5, TimeUnit.SECONDS);
    }

    private static void createRundomAnimal(){
        Random random = new Random();
        int randomInt = random.nextInt(2);
        Animal animal = animalFactory.getAnimal(randomInt);
        animal.setLocation(random.nextInt(1000), random.nextInt(1000));
        System.out.println(String.format("Creating %s, type %s, location: %s %s ",
                animal, animal.getAnimalType(), animal.getLocation()[0], animal.getLocation()[1]));
        animalList.add(animal);
    }

    private static void removeAnimal() {
        Animal animal = animalList.get(0);
        animalList.remove(0);
        System.out.println("Animal has been removed removed " + animal);
    }
}
