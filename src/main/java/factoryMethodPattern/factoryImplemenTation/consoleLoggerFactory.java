package factoryMethodPattern.factoryImplemenTation;
import factoryMethodPattern.Logger;
import factoryMethodPattern.LoggerFactoryNew;
import factoryMethodPattern.implementation.ConsoleLogger;

public class consoleLoggerFactory implements LoggerFactoryNew {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
