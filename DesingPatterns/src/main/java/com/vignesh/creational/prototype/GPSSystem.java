package com.vignesh.creational.prototype;

public class GPSSystem implements Prototype<GPSSystem> {
    public void setVersion(String version) {
        this.version = version;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    private String version;
    private String vendor;

    public GPSSystem(String version, String vendor) {
        this.version = version;
        this.vendor = vendor;
    }

    // Copy constructor for deep cloning
    public GPSSystem(GPSSystem gpsSystem) {
        this.version = gpsSystem.version;
        this.vendor = gpsSystem.vendor;
    }

    @Override
    public GPSSystem Clone() {
        return new GPSSystem(this); // deep copy
    }

    @Override
    public String toString() {
        return "GPSSystem{" +
                "version='" + version + '\'' +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
