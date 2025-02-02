package factoryMethodPattern.implementation;

import factoryMethodPattern.Logger;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Database: " + message);
    }
}
