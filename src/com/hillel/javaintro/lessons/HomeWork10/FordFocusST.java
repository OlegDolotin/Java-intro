package com.hillel.javaintro.lessons.HomeWork10;

public class FordFocusST extends FWD {
    FordFocusST(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed){
        super(countOfTheDoors, fuelTankCapacity, mileage, price, fuelConsumption, maxSpeed);
    }

    public void whatIsItDoing(){
        System.out.println("it has shortened suspension");
    }

    public String toString(){
        return"Count of the doors: "+this.getCountOfTheDoors()+" fuel tank capacity: "+this.getFuelTankCapacity()+
                " mileage: "+this.getMileage()+ " price: "+this.getPrice()+ " fuel consumption: "+this.getFuelConsumption()+
                " max speed: "+this.getMaxSpeed()+ " drive unit: FWD";
    }


}
