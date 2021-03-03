package com.java.myrotiuk.patterns.behaviour.chainofresponsibility;

import lombok.AllArgsConstructor;

/**
 * Created by Ivan on 27.02.2021. All rights reserved.
 */
@AllArgsConstructor
public abstract class DocumentHandler {

    private DocumentHandler nextDocumentHandler;

    public void openDocument(String fileExtension){
        if (nextDocumentHandler != null){
            nextDocumentHandler.openDocument(fileExtension);
        }else{
            throw new IllegalArgumentException("We can not find document handler for such file extension: "
                    + fileExtension);
        }
    }

}
