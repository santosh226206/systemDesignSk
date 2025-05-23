package com.santo.creationalPattern.builderPattern;

public class CarMaker {
    public static void main(String[] args) {
        Car care=new Car.Builder().door("door").build();
        System.out.println(care);
        Car car1=new Car.Builder().door("door1").engine("mhawk").build();
        System.out.println(car1);
        Car car2=new Car.Builder().door("door2").engine("hydra").wheel("alloy").build();
        System.out.println(car2);
        Car car4=new Car("door5","stock","diesel");
        System.out.println(car4);
    }
}
