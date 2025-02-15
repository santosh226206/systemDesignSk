package com.santo.creationalPattern.builderPattern;

public class BuilderPatternClient {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .withCpu("Intel Core i7")
                .withRam(16)

                .withGraphicsCard("NVIDIA GeForce GTX 1080")
                .withHardDrive("1TB SSD")
                .build();

        System.out.println("CPU: " + computer.getCpu());
        System.out.println("RAM: " + computer.getRam() + "GB");
        System.out.println("Hard Drive: " + computer.getHardDrive());
        System.out.println("Graphics Card: " + computer.getGraphicsCard());
    }

}
