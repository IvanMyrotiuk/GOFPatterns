package com.java.myrotiuk.patterns.behaviour.interpreter;

/**
 * Created by Ivan on 01.03.2021. All rights reserved.
 */
public class NameNotPrimitiveType implements Expression {

    @Override
    public String interpret(String context) {
        if (context.equals("int") || context.equals("boolean") || context.equals("double")){
            return context + "1";
        }
        return context;
    }
}
