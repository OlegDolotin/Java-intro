package com.hillel.javaintro.lessons.HomeWork12.TaxiPark.impl;

import com.hillel.javaintro.lessons.HomeWork12.Exception.ValueIsMinusOneException;
import com.hillel.javaintro.lessons.HomeWork12.TaxiPark.TaxiPark;
import com.hillel.javaintro.lessons.HomeWork12.Vehicle.impl.VehicleImpl;

public class Maxim implements TaxiPark {
    private int priceOfTaxiPark;
    public VehicleImpl[] vehicles;

    public Maxim(VehicleImpl[] vehicles) {
        this.vehicles = vehicles;
    }

    public int getPriceOfTaxiPark() {
        for (VehicleImpl i : vehicles)
            priceOfTaxiPark += i.getPrice();
        return priceOfTaxiPark;
    }

    public void sortByFuelConsumption() {
        double temp;
        for (int i = 0; i < vehicles.length; i++)
            for (int j = i + 1; j < vehicles.length - 1; j++) {
                if (vehicles[i].getFuelConsumption() > vehicles[j].getFuelConsumption()) {
                    temp = vehicles[i].getFuelConsumption();
                    vehicles[i].setFuelConsumption(vehicles[j].getFuelConsumption());
                    vehicles[j].setFuelConsumption(temp);
                }
            }
    }


    public VehicleImpl[] getVehiclesByMaxSpeed(int max, int min) throws ValueIsMinusOneException {
        if(max < 0 || min < 0)
            throw new ValueIsMinusOneException("Minus one exception");
        VehicleImpl[] temp = vehicles;
        for (int i = 0; i < vehicles.length; i++) {
            if (!(vehicles[i].getMaxSpeed() >= min && vehicles[i].getMaxSpeed() <= max)) {
                temp = removingElementByIndex(temp, i);
            }
        }
        return temp;
    }

    public VehicleImpl[] copyArrAndPlusOneElement(VehicleImpl[] car) {
        VehicleImpl[] temp = new VehicleImpl[car.length+1];
        for (int i = 0; i < car.length; i++)
            car[i] = temp[i];
        return temp;
    }

    public String toString(VehicleImpl car) {
        return "Count of the doors: " + car.getCountOfTheDoors() + " fuel tank capacity: " + car.getFuelTankCapacity() +
                " mileage: " + car.getMileage() + " price: " + car.getPrice() + " fuel consumption: " + car.getFuelConsumption() +
                " max speed: " + car.getMaxSpeed();
    }

    public VehicleImpl[] removingElementByIndex(VehicleImpl[] cars , int index){
        VehicleImpl[] newCars = new VehicleImpl[cars.length-1];
        for(int i = 0, j = 0; j < newCars.length; i++, j++){
            if(index==i){
                j--;
            }else {
                newCars[j]=cars[i];
            }
        }
        return newCars;
    }


}
