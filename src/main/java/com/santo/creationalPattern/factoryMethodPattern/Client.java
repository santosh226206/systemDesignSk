package com.santo.creationalPattern.factoryMethodPattern;

public class Client {
    private Logger logger;

    public Client(LoggerFactoryNew loggerFactoryNew) {
        this.logger = loggerFactoryNew.createLogger();
    }

    public Logger getLogger() {
        return logger;
    }
}
