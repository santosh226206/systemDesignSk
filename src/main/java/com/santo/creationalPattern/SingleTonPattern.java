package com.santo.creationalPattern;

public class SingleTonPattern {
    // Private constructor to prevent instantiation
    private SingleTonPattern() {}

    // Private static instance of the class
    private static volatile SingleTonPattern instance;

    // Public static method to get the instance
    public static SingleTonPattern getInstance() {
        if (instance == null) {
            synchronized (SingleTonPattern.class) {
                if (instance == null) {
                    instance = new SingleTonPattern();
                }
            }
        }
        return instance;
    }

}
