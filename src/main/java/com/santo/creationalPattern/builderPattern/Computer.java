package com.santo.creationalPattern.builderPattern;

public class Computer {
    private String cpu;
    private int ram;
    private String hardDrive;
    private String graphicsCard;

    // Private constructor to prevent direct instantiation
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hardDrive = builder.hardDrive;
        this.graphicsCard = builder.graphicsCard;
    }

    // Getter methods
    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    // Builder class
    public static class ComputerBuilder {
        private String cpu;
        private int ram;
        private String hardDrive;
        private String graphicsCard;

        public ComputerBuilder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder withRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder withHardDrive(String hardDrive) {
            this.hardDrive = hardDrive;
            return this;
        }

        public ComputerBuilder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

