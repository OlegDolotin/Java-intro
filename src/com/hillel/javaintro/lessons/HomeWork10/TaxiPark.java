package com.hillel.javaintro.lessons.HomeWork10;

class TaxiPark {
    public int priceOfTaxiPark;
    public Vehicle[] vehicles;

    TaxiPark(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public int getPriceOfTaxiPark() {
        for (Vehicle i : vehicles)
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


    public Vehicle[] getVehiclesByMaxSpeed(int max, int min) {
        Vehicle[] temp = vehicles;
        for (int i = 0; i < vehicles.length; i++) {
            if (!(vehicles[i].getMaxSpeed() >= min && vehicles[i].getMaxSpeed() <= max)) {
                temp = removingElementByIndex(temp, i);
            }
        }
        return temp;
    }

    public Vehicle[] copyArrAndPlusOneElement(Vehicle[] car) {
        Vehicle[] temp = new Vehicle[car.length+1];
        for (int i = 0; i < car.length; i++)
            car[i] = temp[i];
        return temp;
    }

    public String toString(Vehicle car) {
        return "Count of the doors: " + car.getCountOfTheDoors() + " fuel tank capacity: " + car.getFuelTankCapacity() +
                " mileage: " + car.getMileage() + " price: " + car.getPrice() + " fuel consumption: " + car.getFuelConsumption() +
                " max speed: " + car.getMaxSpeed();
    }

    public Vehicle[] removingElementByIndex(Vehicle [] cars ,int index){
        Vehicle[] newCars = new Vehicle[cars.length-1];
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
