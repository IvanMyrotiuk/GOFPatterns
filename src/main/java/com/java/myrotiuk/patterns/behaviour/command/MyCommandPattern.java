package com.java.myrotiuk.patterns.behaviour.command;

/**
 * Created by Ivan on 27.02.2021. All rights reserved.
 *
 * The command pattern is a way of making request when we do not know anything about what's exactly
 * is being requested or what exactly is receiving it. It does this by encapsulating the request inside an object.
 * This might seem a bit counterintuitive to develop this used to object-oriented design.
 * Normally a command is something you would put in a method, not a class, but this is a useful way
 * decoupling the object that invokes the command from the objects that knows how to handle it and perform that command.
 *
 * The idea is that this sales order app could easily be used for ordering different types of items, not just
 * for jackets. We shouldn't just do jackets.place oders anywhere in here,
 * because we do not want this sales order client class, to be coupled to that functionality.
 *
 * In the Command pattern a request is encapsulated as an object
 * This pattern involves creating an object whose responsibility is to execute the request.
 *
 */
public class MyCommandPattern {
    public static void main(String[] args) {

        Order jacket = new Jacket();

        OrderHandler orderHandler = new OrderHandler();
        orderHandler.invoke(new BuyCommand(jacket));
        orderHandler.invoke(new ReturnCommand(jacket));

    }
}
