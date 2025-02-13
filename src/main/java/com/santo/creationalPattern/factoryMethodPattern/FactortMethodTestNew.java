package com.santo.creationalPattern.factoryMethodPattern;

import com.santo.creationalPattern.factoryMethodPattern.factoryImplemenTation.consoleLoggerFactory;

public class FactortMethodTestNew {
    public static void main(String[] args) {
        LoggerFactoryNew consoleLoggerFactory=new consoleLoggerFactory();
        Client consoleLoggerClient=new Client(consoleLoggerFactory);
        Logger consoleLogger=consoleLoggerClient.getLogger();
    }
}
