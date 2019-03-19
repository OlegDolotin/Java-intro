package com.hillel.javaintro.lessons.HomeWork10;

abstract public class RWD extends Vehicle {

    RWD(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed){
        super(countOfTheDoors, fuelTankCapacity, mileage, price, fuelConsumption, maxSpeed);
    }
    boolean itHasGimbalShaft = false;
    int countOfHalfShafts = 2;
    public boolean isItHasGimbalShaft(){
        return this.itHasGimbalShaft;
    }
    public int getCountOfHalfShafts(){
        return countOfHalfShafts;
    }
    public String getWheelDrive(){
        return "RWD";
    }
}
