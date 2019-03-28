package com.hillel.javaintro.lessons.ForMe.Plane;



public class GasTurbineEngine extends Engine {
    private double powerOfTurbine;
    GasTurbineEngine(String typeOfEngine, double maxTrustOfEngine, double fuelConsumption, double powerOfTurbine){
        super(typeOfEngine, maxTrustOfEngine, fuelConsumption);
        this.powerOfTurbine = powerOfTurbine;
    }

    public double getPowerOfTurbine() {
        return powerOfTurbine;
    }
}
