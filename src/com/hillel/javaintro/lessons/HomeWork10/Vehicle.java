package com.hillel.javaintro.lessons.HomeWork10;

abstract class Vehicle{
    private int countOfTheDoors;
    private int fuelTankCapacity;
    private int mileage;
    private int price;
    private double fuelConsumption;
    private int maxSpeed;
    public Vehicle(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed){
        this.countOfTheDoors = countOfTheDoors;
        this.fuelTankCapacity = fuelTankCapacity;
        this.mileage = mileage;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }
    public int getMileage(){
        return mileage;
    }
    public int getCountOfTheDoors(){
        return countOfTheDoors;
    }
    public int getFuelTankCapacity(){
        return fuelTankCapacity;
    }
    public int getPrice() {
        return price;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setFuelConsumption(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
    public void setCountOfTheDoors(int countOfTheDoors){
        this.countOfTheDoors = countOfTheDoors;
    }
    public void setFuelTankCapacity(int fuelTankCapacity){
        this.fuelTankCapacity = fuelTankCapacity;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    abstract public void whatIsItDoing();
    abstract String getWheelDrive();


    @Override
    public String toString() {
        return "Count of the doors: "+getCountOfTheDoors()+" fuel tank capacity: "+getFuelTankCapacity()+
                " mileage: "+getMileage()+ " price: "+getPrice()+ " fuel consumption: "+getFuelConsumption() +
                " max speed: "+getMaxSpeed();
    }
}
