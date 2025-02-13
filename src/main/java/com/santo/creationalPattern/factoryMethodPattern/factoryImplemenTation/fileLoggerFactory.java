package com.santo.creationalPattern.factoryMethodPattern.factoryImplemenTation;

import com.santo.creationalPattern.factoryMethodPattern.Logger;
import com.santo.creationalPattern.factoryMethodPattern.LoggerFactoryNew;
import com.santo.creationalPattern.factoryMethodPattern.implementation.FileLogger;

public class fileLoggerFactory implements LoggerFactoryNew {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
