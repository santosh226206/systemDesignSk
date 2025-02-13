package com.santo.creationalPattern.factoryMethodPattern;

import com.santo.creationalPattern.factoryMethodPattern.implementation.ConsoleLogger;
import com.santo.creationalPattern.factoryMethodPattern.implementation.DatabaseLogger;
import com.santo.creationalPattern.factoryMethodPattern.implementation.FileLogger;
//import implementation.*;
//The Client class creates TwoWheeler and FourWheeler objects directly based on input. This strong dependency makes the code hard to maintain or update.
//The Client class not only decides which vehicle to create but also handles its lifecycle. This mixes responsibilities, which goes against the principle that a class should only have one reason to change.
//To add a new vehicle type, you must modify the Client class, which makes it difficult to scale the design. This conflicts with the idea that classes should be open for extension but closed for modification.

public class LoggerFactory {
    public static Logger createLogger(String type) {
        if (type.equalsIgnoreCase("console")) {
            return new ConsoleLogger();
        } else if (type.equalsIgnoreCase("file")) {
            return new FileLogger();
        } else if (type.equalsIgnoreCase("database")) {
            return new DatabaseLogger();
        } else {
            throw new UnsupportedOperationException("Unsupported logger type");
        }
    }
}

