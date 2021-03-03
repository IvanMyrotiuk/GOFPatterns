package com.java.myrotiuk.patterns.behaviour.chainofresponsibility;

/**
 * Created by Ivan on 27.02.2021. All rights reserved.
 */
public class SpreadSheetDocumentHandler extends DocumentHandler {

    public SpreadSheetDocumentHandler(DocumentHandler documentHandler) {
        super(documentHandler);
    }

    @Override
    public void openDocument(String fileExtension){
        System.out.println("Trying spreadsheet handler");
        if ("xls".equals(fileExtension)) {
            System.out.println("We are processing spreadsheet documents with extension xls:"+fileExtension);
        }else {
            super.openDocument(fileExtension);
        }
    }

}
