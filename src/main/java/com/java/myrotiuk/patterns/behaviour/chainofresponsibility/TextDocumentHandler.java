package com.java.myrotiuk.patterns.behaviour.chainofresponsibility;

/**
 * Created by Ivan on 27.02.2021. All rights reserved.
 */
public class TextDocumentHandler extends DocumentHandler {

    public TextDocumentHandler(DocumentHandler documentHandler) {
        super(documentHandler);
    }

    @Override
    public void openDocument(String fileExtension){
        System.out.println("Trying txt handler");
        if ("txt".equals(fileExtension)) {
            System.out.println("We are processing text documents with extension txt:"+fileExtension);
        }else {
            super.openDocument(fileExtension);
        }
    }

}
