package com.java.myrotiuk.patterns.behaviour.memento;

/**
 * Created by Ivan on 02.03.2021. All rights reserved.
 */
public class TextDocument {

    private String text = "";
    private MementoTextDocument memento = new MementoTextDocument(text);

    public void addText(String text){
        this.text += text;
    }

    public void print(){
        System.out.println(text);
    }

    public void save(){
        memento.setState(text);
    }

    public void undo(){
        this.text = memento.getState();
    }




}
