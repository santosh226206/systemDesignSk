package factoryMethodPattern.factoryImplemenTation;

import factoryMethodPattern.Logger;
import factoryMethodPattern.LoggerFactoryNew;
import factoryMethodPattern.implementation.DatabaseLogger;

public class databaseLoggerFactory implements LoggerFactoryNew {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
