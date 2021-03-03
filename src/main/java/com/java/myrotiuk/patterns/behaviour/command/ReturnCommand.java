package com.java.myrotiuk.patterns.behaviour.command;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 27.02.2021. All rights reserved.
 */
@AllArgsConstructor
public class ReturnCommand implements Command {

    private Order order;//we may order not just jacket

    @Override
    public void execute() {
        order.returnOrder();
    }
}
