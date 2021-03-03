package com.java.myrotiuk.patterns.behaviour.interpreter;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 01.03.2021. All rights reserved.
 */
public class NameWithoutUnderscore implements Expression {

    private NameWithLowerCase nameWithLowerCase = new NameWithLowerCase();

    @Override
    public String interpret(String context) {
        if (context.startsWith("_")) {
            context = context.substring(1);
        }
        return nameWithLowerCase.interpret(context);
    }
}
