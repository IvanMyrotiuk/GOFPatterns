package com.java.myrotiuk.patterns.behaviour.memento;

/**
 * Created by Ivan on 02.03.2021. All rights reserved.
 * In order to save state of the object at a given time without breaking principle of encapsulation in order
 * to go back to previous state later(that was saved at a given period of time)
 *
 * May potentially increase usage of memory
 */
public class MyMemento {
    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();
        textDocument.addText("Hello");
        textDocument.print();
        textDocument.save();
        textDocument.addText(" World!!!");
        textDocument.print();
        textDocument.undo();
        textDocument.print();

    }
}
