package com.java.myrotiuk.patterns.structural.proxy;

/**
 * Created by Ivan on 26.02.2021. All rights reserved.
 *
 * A proxy is used as a source of replacement for a real object.
 * It literally means a substitution for the real thing.
 * bank card , proxy server (sit between the client and the server and pass messages between those two)
 *
 * We have got an app for displaying docs there might be a big picture on page 50 of the doc and we open document we really
 * do not want to load the big picture right away as that might take a long time and use lots of memory.
 * We also even do not know whether user will scroll down to page 50.
 * Instead of loading the big image straight away, we can create a proxy object for it.
 * Proxy objects differentiate between expensive and inexpensive operations
 * The image object might have inexpensive methods like getWidth(), getHeight()
 * and you want to access this information before actually draw it.
 * Other things like loadingImageFromDisk are expensive and we do not want to call them until we really need to.
 * This is where the proxy pattern comes in to help.
 * It only calls expensive methods when needed. this is a technique known as lazy loading.
 * Proxy pattern is used
 * 1. when we want to replace large object with something more versatile.(in GUI)
 * 2. For representing expensive DB connections. Just when we are interacting with DB rather then at start time
 * 3. Authentication access
 *
 * |
 *
 *
 */
public class MyProxy {
    public static void main(String[] args) {
        Inventory inventory = new InventoryProxy();
        Store store = new Store("Myrotiuk", "California", inventory);

        store.printName();
        store.printLocation();
        store.printInventory();
    }
}
