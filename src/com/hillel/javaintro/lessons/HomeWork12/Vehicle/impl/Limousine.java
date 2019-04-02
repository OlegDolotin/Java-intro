package com.hillel.javaintro.lessons.HomeWork12.Vehicle.impl;

public class Limousine extends VehicleImpl {
    private boolean thePresenceOfAGlassPartitionBetweenTheDrivenAndPassengers;
    private boolean isThePartitionUp = false;
    public Limousine(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed,
              boolean thePresenceOfAGlassPartitionBetweenTheDrivenAndPassengers) {
        super(countOfTheDoors, fuelTankCapacity, mileage, price, fuelConsumption, maxSpeed);
        this.thePresenceOfAGlassPartitionBetweenTheDrivenAndPassengers = thePresenceOfAGlassPartitionBetweenTheDrivenAndPassengers;
    }

    public boolean isThePresenceOfAGlassPartitionBetweenTheDrivenAndPassengers() {
        return thePresenceOfAGlassPartitionBetweenTheDrivenAndPassengers;
    }

    public boolean isThePartitionUp(){
        return isThePartitionUp;
    }

    public void closeThePartition(){
        if(!(thePresenceOfAGlassPartitionBetweenTheDrivenAndPassengers))
            return;
        isThePartitionUp = true;
        System.out.println("The partition is closed!");
    }

    public void openThePartition(){
        if(!(thePresenceOfAGlassPartitionBetweenTheDrivenAndPassengers))
            return;
        isThePartitionUp = false;
        System.out.println("The partition is open!");
    }

    @Override
    public String toString() {
        return super.toString()+" the presence of a glass partition between the driven and passengers - "+this.thePresenceOfAGlassPartitionBetweenTheDrivenAndPassengers;
    }
}
