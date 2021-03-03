package com.java.myrotiuk.patterns.behaviour.chainofresponsibility;

/**
 * Created by Ivan on 27.02.2021. All rights reserved.
 */
public class SlideshowHandler extends DocumentHandler {

    public SlideshowHandler(DocumentHandler documentHandler) {
        super(documentHandler);
    }

    @Override
    public void openDocument(String fileExtension){
        System.out.println("Trying slideshow handler");
        if ("ppt".equals(fileExtension)) {
            System.out.println("We are processing slide documents with extension ppt:"+fileExtension);
        }else {
            super.openDocument(fileExtension);
        }
    }

}
