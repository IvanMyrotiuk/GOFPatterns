package com.java.myrotiuk.patterns.creational.singleton;

/**
 * Created by Ivan on 22.02.2021. All rights reserved.
 */
public class MySingleton {
    public static void main(String[] args) {

    }
}

class EagerSingleton{

    private static final EagerSingleton SINGLETON = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return SINGLETON;
    }
}

enum EnumSingleton{
    SINGLETON
}

class SynchronizedSingleton{

    private static SynchronizedSingleton instance;

    public static synchronized SynchronizedSingleton getInstance(){
        if (instance == null){
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}

class Synchronized2Singleton{

    private static volatile Synchronized2Singleton instance;

    public static Synchronized2Singleton getInstance(){
        Synchronized2Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Synchronized2Singleton.class){
                localInstance = instance;
                if (localInstance == null){
                    instance = localInstance = new Synchronized2Singleton();
                }
            }
        }
        return instance;
    }
}

class MySingletonHolder {

    private static class SingletonHolder {
        static final MySingletonHolder INSTANCE = new MySingletonHolder();
    }

    public static MySingletonHolder getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

