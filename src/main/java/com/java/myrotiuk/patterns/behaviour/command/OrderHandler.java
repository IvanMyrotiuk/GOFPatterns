package com.java.myrotiuk.patterns.behaviour.command;

/**
 * Created by Ivan on 27.02.2021. All rights reserved.
 */
public class OrderHandler {

    public void invoke(Command command){
        command.execute();
    }

}
