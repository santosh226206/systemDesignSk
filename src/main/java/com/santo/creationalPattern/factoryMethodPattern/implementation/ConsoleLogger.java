package com.santo.creationalPattern.factoryMethodPattern.implementation;

import com.santo.creationalPattern.factoryMethodPattern.Logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console: " + message);
    }
}
