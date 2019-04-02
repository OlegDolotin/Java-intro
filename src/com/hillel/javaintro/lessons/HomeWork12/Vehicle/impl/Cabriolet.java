package com.hillel.javaintro.lessons.HomeWork12.Vehicle.impl;

public class Cabriolet extends VehicleImpl {
    private String typeOfFoldingRoof;
    private boolean isRoofRaised = false;
    public Cabriolet(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed,
              String typeOfFoldingRoof){
        super(countOfTheDoors, fuelTankCapacity, mileage, price, fuelConsumption, maxSpeed);
        this.typeOfFoldingRoof = typeOfFoldingRoof;
    }

    public String getTypeOfFoldingRoof() {
        return typeOfFoldingRoof;
    }

    public boolean isRoofRaised(){
        return isRoofRaised;
    }

    public void raiseTheRoof(){
        isRoofRaised = true;
        System.out.println("Roof is raised!");
    }

    public void pullDownTheRoof(){
        isRoofRaised = false;
        System.out.println("Roof is pulled down!");
    }

    @Override
    public String toString() {
        return super.toString()+" type of folding roof - "+this.typeOfFoldingRoof;
    }
}
