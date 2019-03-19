package com.hillel.javaintro.lessons.HomeWork10;

abstract public class FWD extends Vehicle{

    FWD(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed){
        super(countOfTheDoors, fuelTankCapacity, mileage, price, fuelConsumption, maxSpeed);
    }
    boolean itHasGimbalShaft = true;
    private int countOfHalfShafts = 2;
    public String getWheelDrive(){
        return "FWD";
    }

    public int getCountOfHalfShafts(){
        return countOfHalfShafts;
    }
    public boolean isItHasGimbalShaft(){
        return this.itHasGimbalShaft;
    }

}
