package com.hillel.javaintro.lessons.HomeWork10;

public class BMW220i extends FWD{
    BMW220i(int countOfTheDoors, int fuelTankCapacity, int mileage, int price, double fuelConsumption, int maxSpeed){
        super(countOfTheDoors, fuelTankCapacity, mileage, price, fuelConsumption, maxSpeed);
    }

    public void whatIsItDoing() {
        System.out.println("it is drifting");
    }

    public String toString(){
        return"Count of the doors: "+this.getCountOfTheDoors()+" fuel tank capacity: "+this.getFuelTankCapacity()+
                " mileage: "+this.getMileage()+ " price: "+this.getPrice()+ " fuel consumption: "+this.getFuelConsumption() +
                " max speed: "+this.getMaxSpeed()+ " drive unit: RWD";
    }
}
