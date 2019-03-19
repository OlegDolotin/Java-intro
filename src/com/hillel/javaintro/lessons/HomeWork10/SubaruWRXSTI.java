package com.hillel.javaintro.lessons.HomeWork10;

public class SubaruWRXSTI extends AWD {
    SubaruWRXSTI(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed){
        super(countOfTheDoors, fuelTankCapacity, mileage, price, fuelConsumption, maxSpeed);
    }
    private String typeOfEngine = "opposed";
    public void whatIsItDoing(){
        System.out.println("this car is clearly piling");
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public String toString(){
        return"Count of the doors: "+this.getCountOfTheDoors()+" fuel tank capacity: "+this.getFuelTankCapacity()+
                " mileage: "+this.getMileage()+ " price: "+this.getPrice()+ " fuel consumption: "+this.getFuelConsumption() +
                " max speed: "+this.getMaxSpeed()+ " drive unit: AWD";
    }
}
