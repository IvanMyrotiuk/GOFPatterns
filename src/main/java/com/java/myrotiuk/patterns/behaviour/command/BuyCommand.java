package com.java.myrotiuk.patterns.behaviour.command;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 27.02.2021. All rights reserved.
 */
@AllArgsConstructor
public class BuyCommand implements Command {

    private Order order;//we may buy not just order I mean that instead of order interface here might be something else so that we can create lots of commands
    //but if we implement execute(Order order) we would need implement just this one and create another one command...

    @Override
    public void execute() {
        order.buyOrder();
    }
}
