package com.hillel.forMe.Plane;

abstract class Engine {
    private String typeOfEngine;
    private double maxTrustOfEngine;
    private double fuelConsumption;
    private double countOfOil;
    Engine(String typeOfEngine, double maxTrustOfEngine, double fuelConsumption){
        this.typeOfEngine = typeOfEngine;
        this.maxTrustOfEngine = maxTrustOfEngine;
        this.fuelConsumption = fuelConsumption;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getMaxTrustOfEngine() {
        return maxTrustOfEngine;
    }

    public double getCountOfOil() {
        return countOfOil;
    }
    public void pourOilToFull(){
        if(this.countOfOil >= 20)
            return;
        else
            this.countOfOil = 20;
    }
    public void pourOil(double count){
        if(this.countOfOil+count >= 20)
            System.out.println("doesn't fit in the tank!");
        else
            this.countOfOil += count;
    }
}
