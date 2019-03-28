package com.hillel.javaintro.lessons.ForMe.Plane;

public class PistonEngine extends Engine{
    private String reliability = "High";
    private double volumeOfEngine;
    private String price = "Cheap";
    PistonEngine(String typeOfEngine, double maxTrustOfEngine, double fuelConsumption, double volumeOfEngine){
        super(typeOfEngine, maxTrustOfEngine, fuelConsumption);
        this.volumeOfEngine = volumeOfEngine;
    }

    public String getPrice() {
        return price;
    }

    public String getReliability() {
        return reliability;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }
}
