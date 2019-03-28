package com.hillel.javaintro.lessons.HomeWork11.TaxiPark;

import com.hillel.javaintro.lessons.HomeWork11.Vehicle.impl.VehicleImpl;

public interface TaxiPark {
    int getPriceOfTaxiPark();
    void sortByFuelConsumption();
    VehicleImpl[] getVehiclesByMaxSpeed(int max, int min);
}
