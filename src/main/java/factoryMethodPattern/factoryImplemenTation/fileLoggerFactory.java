package factoryMethodPattern.factoryImplemenTation;

import factoryMethodPattern.Logger;
import factoryMethodPattern.LoggerFactoryNew;
import factoryMethodPattern.implementation.FileLogger;

public class fileLoggerFactory implements LoggerFactoryNew {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
