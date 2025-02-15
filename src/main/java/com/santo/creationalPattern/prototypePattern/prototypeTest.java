package com.santo.creationalPattern.prototypePattern;

public class prototypeTest {
    public static void main(String[] args) {
        // Create an original car object
        Car originalCar = new Car("Toyota", "Corolla", 2015);

        // Clone the original car object
        Car clonedCar = (Car) originalCar.clone();
        System.out.println(clonedCar);
        // Modify the cloned car object
        clonedCar = new Car("Honda", "Civic", 2020);

        // Print the original and cloned car objects
        System.out.println("Original Car: " + originalCar.getBrand() + " " + originalCar.getModel() + " " + originalCar.getYear());
        System.out.println("Cloned Car: " + clonedCar.getBrand() + " " + clonedCar.getModel() + " " + clonedCar.getYear());
    }

}
