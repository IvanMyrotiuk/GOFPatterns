package com.java.myrotiuk.patterns.behaviour.chainofresponsibility;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 *
 * When we have some code that needs to make a request, but you don't know until runtime
 * which object wil be handling the request, you might want to consider using the chain of responsibility pattern.
 * We want to avoid coupling the sender of a request to its receiver
 * This pattern is useful when we need to make a request,
 * but won't know until runtime which object will handle it.
 *
 */
public class MyChainOfResponsibility {
    public static void main(String[] args) {
        DocumentHandler documentHandler = new SlideshowHandler(
                new SpreadSheetDocumentHandler(
                        new TextDocumentHandler(null)
                ));

        documentHandler.openDocument("txt");
        //documentHandler.openDocument("txt2");
        documentHandler.openDocument("ppt");
        documentHandler.openDocument("xls");
    }
}
