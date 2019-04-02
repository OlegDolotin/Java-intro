package com.hillel.javaintro.lessons.HomeWork12.Main;

import com.hillel.javaintro.lessons.HomeWork12.TaxiPark.impl.Maxim;
import com.hillel.javaintro.lessons.HomeWork12.Vehicle.impl.Cabriolet;
import com.hillel.javaintro.lessons.HomeWork12.Vehicle.impl.Limousine;
import com.hillel.javaintro.lessons.HomeWork12.Vehicle.impl.Van;
import com.hillel.javaintro.lessons.HomeWork12.Vehicle.impl.VehicleImpl;

public class Main {
    public static void main(String[] args) {
        VehicleImpl[] g = {new Cabriolet(4, 50, 46000, 11200, 9.0, 200,
        "cloth"),
                new Limousine(2, 55, 73000, 35620, 8.1, 235,
                        true),
                new Van(4, 45, 115000, 16500, 14.0, 250,
                        600)};

        Maxim f = new Maxim(g);
        //System.out.println(f.getPriceOfTaxiPark());
        /*for(int i = 0; i < f.vehicles.length; i++)
            System.out.println(f.toString(f.vehicles[i]));*/
        /*f.sortByFuelConsumption();
        for(int i = 0; i < f.vehicles.length; i++)
            System.out.println(f.toString(f.vehicles[i]));*/
        VehicleImpl[] h;
        try {
            h=f.getVehiclesByMaxSpeed(-250, 220);
            for(int i = 0; i < h.length; i++)
                System.out.println(h[i].toString());
        }catch (Exception MinusOneException){
            System.out.println("Minus One Exception!");
            h=f.vehicles;
        }




        /*for(int i = 0; i < f.vehicles.length; i++)
            System.out.println(f.toString(f.vehicles[i]));*/

    }
}
