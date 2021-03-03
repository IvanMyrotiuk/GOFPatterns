package com.java.myrotiuk.patterns.behaviour.mediator;

/**
 * Created by Ivan on 01.03.2021. All rights reserved.
 *
 * At restaurant mediator is waiter he collects orders gives them to chef and then collect money from client and
 * give the money to the manager. So those group of people do not need to interact with each other
 * For Loose coupling
 * When we have got huge amount of objects which interact each with other it may happen situation when we change something
 * in one place we need to change in many others
 * Hard to reuse as they communicate with so many others.
 * The idea of mediator pattern is to have an object that's sole purpose is to handle these interactions between all of the different objects.
 * It sits in the middle of them all and handle the communications between them.
 *
 * In applications with lots of objects, a Mediator sits between them and handles their interactions
 *
 */
public class MyMediator {

    public static void main(String[] args) {
        Customer customer = new Customer("Beverly Hills 7");
        ECommerceSite eCommerceSite = new ECommerceSite();
        Driver driver = new Driver();
        Mediator mediator = new Mediator(customer, eCommerceSite, driver);
        mediator.buy("erasers", 40);
    }

}
