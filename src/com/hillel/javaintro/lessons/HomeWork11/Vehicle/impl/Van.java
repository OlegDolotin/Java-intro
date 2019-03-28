package com.hillel.javaintro.lessons.HomeWork11.Vehicle.impl;

import com.hillel.javaintro.lessons.HomeWork11.Vehicle.impl.VehicleImpl;

public class Van extends VehicleImpl {
    private int theCapacityOfCargoCompartment;
    private int cargoCompartment;
    private String typeOfCargo;
    private boolean isCargoCompartmentEmpty = (cargoCompartment == 0)? true : false;
    public Van(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed,
        int theCapacityOfCargoCompartment){
        super(countOfTheDoors, fuelTankCapacity, mileage, price, fuelConsumption, maxSpeed);
        this.theCapacityOfCargoCompartment = theCapacityOfCargoCompartment;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public int getTheCapacityOfCargoCompartment() {
        return theCapacityOfCargoCompartment;
    }

    public int getCargoCompartment() {
        return cargoCompartment;
    }

    public boolean isCargoCompartmentEmpty() {
        return isCargoCompartmentEmpty;
    }

    public void loadCargo(String typeOfCargo, int weight){
        if(weight > theCapacityOfCargoCompartment || weight <= 0 || !(isCargoCompartmentEmpty))
            return;
        this.typeOfCargo = typeOfCargo;
        cargoCompartment += weight;
        System.out.println("Cargo is loaded! Weight of cargo = "+weight+" type of cargo: "+typeOfCargo);
    }

    public void unloadCargo(int weight){
        if(weight > theCapacityOfCargoCompartment || weight > cargoCompartment || weight < 0)
            return;
        cargoCompartment -= weight;
        if(isCargoCompartmentEmpty) {
            typeOfCargo = null;
            System.out.println("Cargo compartment is empty!");
        }
    }

    @Override
    public String toString() {
        return super.toString()+" the capacity of cargo compartment = "+this.cargoCompartment;
    }
}
