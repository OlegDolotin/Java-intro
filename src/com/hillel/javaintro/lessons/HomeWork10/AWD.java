package com.hillel.javaintro.lessons.HomeWork10;

abstract public class AWD extends Vehicle {

    AWD(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed){
        super(countOfTheDoors, fuelTankCapacity, mileage, price, fuelConsumption, maxSpeed);
    }
    boolean itHasGimbalShaft = true;
    int countOfHalfShafts = 4;
    public boolean isItHasGimbalShaft(){
        return this.itHasGimbalShaft;
    }
    public int getCountOfHalfShafts(){
        return countOfHalfShafts;
    }
    public String getWheelDrive(){
        return "AWD";
    }
}
