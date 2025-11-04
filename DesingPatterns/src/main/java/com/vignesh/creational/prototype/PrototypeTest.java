package com.vignesh.creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        GPSSystem gps = new GPSSystem("v2.0", "Garmin");

        Car car1 = new Car();
        car1.setBrand("Tesla");
        car1.setModel("Model S");
        car1.setColor("Red");
        car1.setTopSpeed(250);
        car1.setGpsSystem(gps);



        Car car2 = car1.Clone();
        GPSSystem gpsSystem2 = car2.getGpsSystem();
        gpsSystem2.setVersion("V3");


        System.out.println(car1);
        System.out.println();
        System.out.println(car2);
    }
}
