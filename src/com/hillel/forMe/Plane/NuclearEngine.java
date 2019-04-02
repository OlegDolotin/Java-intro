package com.hillel.forMe.Plane;

public class NuclearEngine extends Engine {
    private double nuclearRods;
    NuclearEngine(String typeOfEngine, double maxTrustOfEngine, double fuelConsumption, double nuclearRods){
        super(typeOfEngine, maxTrustOfEngine, fuelConsumption);
        this.nuclearRods = nuclearRods;
    }

    public double getNuclearRods() {
        return nuclearRods;
    }
}
