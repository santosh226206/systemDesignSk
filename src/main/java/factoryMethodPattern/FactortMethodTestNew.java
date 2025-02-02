package factoryMethodPattern;

import factoryMethodPattern.factoryImplemenTation.consoleLoggerFactory;

public class FactortMethodTestNew {
    public static void main(String[] args) {
        LoggerFactoryNew consoleLoggerFactory=new consoleLoggerFactory();
        Client consoleLoggerClient=new Client(consoleLoggerFactory);
        Logger consoleLogger=consoleLoggerClient.getLogger();
    }
}
