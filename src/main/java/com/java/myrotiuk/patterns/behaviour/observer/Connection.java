package com.java.myrotiuk.patterns.behaviour.observer;

import lombok.Setter;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by Ivan on 02.03.2021. All rights reserved.
 *
 * This is observable
 */
public class Connection {

    private String status = "";
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void setStatus(String status) {
        propertyChangeSupport.firePropertyChange("status", this.status, status);
        this.status = status;
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }

}
