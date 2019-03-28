package com.hillel.javaintro.lessons.ForMe.Plane;

public class Wing {
    private double wingspan;
    private boolean isItHasWingLet;
    private double fuelTankCapacity;
    private double amountOfFuel;
    Wing(double wingspan, double fuelTankCapacity, boolean isItHasWingLet){
        this.wingspan = wingspan;
        this.fuelTankCapacity = fuelTankCapacity;
        this.isItHasWingLet = isItHasWingLet;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public double getWingspan() {
        return wingspan;
    }

    public boolean isItHasWingLet() {
        return isItHasWingLet;
    }

    public void fillUpTheFuelTankOnN(double N){
        if(amountOfFuel+N > 13000)
            return;
        this.amountOfFuel += N;
        System.out.println("Fuel in the tank: "+N);
    }

    public void fillUpTheFuelTankToFull(){
        if(amountOfFuel >= 13000)
            return;
        this.amountOfFuel = 13000;
        System.out.println("Fuel in the tank: 13000");
    }

    public void drainTheFuelOn(double N){
        if(amountOfFuel - N <= 0)
            return;
        this.amountOfFuel -= N;
    }


}
