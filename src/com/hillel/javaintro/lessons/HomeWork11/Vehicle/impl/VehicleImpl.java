package com.hillel.javaintro.lessons.HomeWork11.Vehicle.impl;

import com.hillel.javaintro.lessons.HomeWork11.Vehicle.Vehicle;

public abstract class VehicleImpl implements Vehicle {
    private int countOfTheDoors;
    private int fuelTankCapacity;
    private int mileage;
    private int price;
    private double fuelConsumption;
    private int maxSpeed;
    VehicleImpl(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed){
        this.countOfTheDoors = countOfTheDoors;
        this.fuelTankCapacity = fuelTankCapacity;
        this.mileage = mileage;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCountOfTheDoors() {
        return countOfTheDoors;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String toString() {
        return "Count of the doors: " + this.getCountOfTheDoors() + " fuel tank capacity: " + this.getFuelTankCapacity() +
                " mileage: " + this.getMileage() + " price: " + this.getPrice() + " fuel consumption: " + this.getFuelConsumption() +
                " max speed: " + this.getMaxSpeed();
    }
}
