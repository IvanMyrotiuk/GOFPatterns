package com.java.myrotiuk.patterns.behaviour.interpreter;

/**
 * Created by Ivan on 01.03.2021. All rights reserved.
 *
 * Interpreter pattern is a pattern for translating one language to another
 * Context- what we will change interpret
 * Abstract Expression interpret(context)
 * There are two implementation of our abstract class Non Terminal Expression (context) and
 * Terminal Expression(context)
 * A non terminal Expression cause the interpret method, which alters the context, and then it passes the context
 * onto another expression until it reaches the terminal expression.
 * A terminal expression is the last time the interpret method gets called.
 *
 */
public class MyInterpreter {
    public static void main(String[] args) {
        NameWithoutUnderscore nameWithoutUnderscore = new NameWithoutUnderscore();
        String result1 = nameWithoutUnderscore.interpret("_Int");
        String result2 = nameWithoutUnderscore.interpret("Int");
        String result3 = nameWithoutUnderscore.interpret("int");
        String result4 = nameWithoutUnderscore.interpret("intty");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
