package com.santo.creationalPattern.factoryMethodPattern.factoryImplemenTation;
import com.santo.creationalPattern.factoryMethodPattern.Logger;
import com.santo.creationalPattern.factoryMethodPattern.LoggerFactoryNew;
import com.santo.creationalPattern.factoryMethodPattern.implementation.ConsoleLogger;

public class consoleLoggerFactory implements LoggerFactoryNew {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
