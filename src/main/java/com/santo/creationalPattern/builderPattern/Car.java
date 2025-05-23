package com.santo.creationalPattern.builderPattern;

public class Car {
private final String door;
private final String wheel;
private final String engine;
Car(Builder builde){
    this.door=builde.door;
    this.engine=builde.engine;
    this.wheel=builde.wheel;
}

    @Override
    public String toString() {
        return "Car{" +
                "door='" + door + '\'' +
                ", wheel='" + wheel + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public static class Builder{
     String door;
     String wheel;
    String engine;
    Builder door(String door){
        this.door=door;
        return this;
    }
    Builder wheel(String wheel){
        this.wheel=wheel;
        return this;
    }
    Builder engine(String engine){
        this.engine=engine;
        return this;
    }
    Car build(){
        return new Car(this);
    }
}
}
