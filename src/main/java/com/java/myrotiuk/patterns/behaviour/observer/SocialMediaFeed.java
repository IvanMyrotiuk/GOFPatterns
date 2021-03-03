package com.java.myrotiuk.patterns.behaviour.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 02.03.2021. All rights reserved.
 *
 * This is observer
 */
public class SocialMediaFeed implements PropertyChangeListener {

    private List<String> statusList = new ArrayList<>();

    public void printStatuses(){
        statusList.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        statusList.add((String) evt.getNewValue());
    }
}
