package com.java.myrotiuk.patterns.behaviour.observer;

import java.beans.PropertyChangeEvent;

/**
 * Created by Ivan on 02.03.2021. All rights reserved.
 *
 * Observing objects
 * You would use it when you have one or more objects that need to be notified of changes made by another object
 * and updated accordingly.
 * For instance app that shows different types of charts, you would want them all to update when the data is updated
 * or list of people that should be notified when the product will become available in the stock
 *
 * Problem of Observer and Observable is that although they can be used to tell that something had changed, they don't
 * give any details about what has changed.
 *
 */
public class MyObserver {
    public static void main(String[] args) {
        Connection sally = new Connection();
        Connection bob = new Connection();
        SocialMediaFeed feed = new SocialMediaFeed();

        sally.addPropertyChangeListener(feed);
        bob.addPropertyChangeListener(feed);

        sally.setStatus("going for a walk");
        sally.setStatus("going for a walk1");
        bob.setStatus("eating my lunch");
        bob.setStatus("eating my lunch2");

        feed.printStatuses();
    }
}
