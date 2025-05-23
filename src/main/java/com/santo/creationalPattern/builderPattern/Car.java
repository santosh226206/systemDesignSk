package com.santo.creationalPattern.builderPattern;

//public class Car {
//private final String door;
//private final String wheel;
//private final String engine;
//Car(Builder builde){
//    this.door=builde.door;
//    this.engine=builde.engine;
//    this.wheel=builde.wheel;
//}
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "door='" + door + '\'' +
//                ", wheel='" + wheel + '\'' +
//                ", engine='" + engine + '\'' +
//                '}';
//    }
//
//    public static class Builder{
//     String door;
//     String wheel;
//    String engine;
//    Builder door(String door){
//        this.door=door;
//        return this;
//    }
//    Builder wheel(String wheel){
//        this.wheel=wheel;
//        return this;
//    }
//    Builder engine(String engine){
//        this.engine=engine;
//        return this;
//    }
//    Car build(){
//        return new Car(this);
//    }
//}
//}

public class Car {
    private final String door;
    private final String wheel;
    private final String engine;

    // Public constructor to allow object creation without Builder
    public Car(String door, String wheel, String engine) {
        this.door = door;
        this.wheel = wheel;
        this.engine = engine;
    }

    // Builder-based constructor (used by the Builder)
    private Car(Builder builder) {
        this.door = builder.door;
        this.wheel = builder.wheel;
        this.engine = builder.engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "door='" + door + '\'' +
                ", wheel='" + wheel + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private String door;
        private String wheel;
        private String engine;

        public Builder door(String door) {
            this.door = door;
            return this;
        }

        public Builder wheel(String wheel) {
            this.wheel = wheel;
            return this;
        }

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

