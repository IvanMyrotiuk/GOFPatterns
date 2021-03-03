package com.java.myrotiuk.patterns.behaviour.interpreter;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 01.03.2021. All rights reserved.
 */
public class NameWithLowerCase implements Expression {

    private NameNotPrimitiveType nameNotPrimitiveType = new NameNotPrimitiveType();

    @Override
    public String interpret(String context) {
        String currContext = context.substring(0,1).toLowerCase() + context.substring(1);
        return nameNotPrimitiveType.interpret(currContext);
    }
}
