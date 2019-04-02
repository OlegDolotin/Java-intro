package com.hillel.javaintro.lessons.HomeWork12.TaxiPark;

import com.hillel.javaintro.lessons.HomeWork12.Exception.ValueIsMinusOneException;
import com.hillel.javaintro.lessons.HomeWork12.Vehicle.impl.VehicleImpl;

public interface TaxiPark {
    int getPriceOfTaxiPark();
    void sortByFuelConsumption();
    VehicleImpl[] getVehiclesByMaxSpeed(int max, int min) throws ValueIsMinusOneException;
}
