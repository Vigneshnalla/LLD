package com.vignesh.creational.prototype;

public abstract class Vehicle implements Prototype<Vehicle> {
    private String brand;
    private String model;
    private String color;

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public Vehicle() {}

    // Getters and setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
