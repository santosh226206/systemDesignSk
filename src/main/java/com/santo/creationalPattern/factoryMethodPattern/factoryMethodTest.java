package com.santo.creationalPattern.factoryMethodPattern;

public class factoryMethodTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.createLogger("console");
        logger.log("Hello, World!");

        logger = LoggerFactory.createLogger("file");
        logger.log("Hello, World!");

        logger = LoggerFactory.createLogger("database");
        logger.log("Hello, World!");
    }

}
