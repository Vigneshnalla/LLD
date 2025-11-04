package com.vignesh.creational.prototype;

public class Car extends Vehicle {
    private int topSpeed;
    private GPSSystem gpsSystem;

    public Car() {}

    // Copy constructor for deep cloning
    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
        this.gpsSystem = car.gpsSystem; // this is shallow copying  in this the newly added class will
//        reference the smae gpssystem  object in the memory and any change done on this object will be reflected in both cars

//        this.gpsSystem = car.gpsSystem != null ? car.gpsSystem.Clone() : null;
    }

    @Override
    public Car Clone() {
        return new Car(this);
    }

    // Getters and setters
    public int getTopSpeed() { return topSpeed; }
    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }

    public GPSSystem getGpsSystem() { return gpsSystem; }
    public void setGpsSystem(GPSSystem gpsSystem) { this.gpsSystem = gpsSystem; }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", topSpeed=" + topSpeed +
                ", gpsSystem=" + gpsSystem +
                '}';
    }
}


