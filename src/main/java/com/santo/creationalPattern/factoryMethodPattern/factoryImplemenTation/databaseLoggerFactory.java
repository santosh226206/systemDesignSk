package com.santo.creationalPattern.factoryMethodPattern.factoryImplemenTation;

import com.santo.creationalPattern.factoryMethodPattern.Logger;
import com.santo.creationalPattern.factoryMethodPattern.LoggerFactoryNew;
import com.santo.creationalPattern.factoryMethodPattern.implementation.DatabaseLogger;

public class databaseLoggerFactory implements LoggerFactoryNew {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
