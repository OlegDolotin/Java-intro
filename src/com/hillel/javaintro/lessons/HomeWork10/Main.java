package com.hillel.javaintro.lessons.HomeWork10;

public class Main {
    public static void main(String[] args) {
        Vehicle[] g = {new FordFocusST(4, 50, 46000, 11200, 9.0, 200),
                new BMW220i(2, 55, 73000, 35620, 8.1, 235),
                new SubaruWRXSTI(4, 45, 115000, 16500, 14.0, 250)};

        TaxiPark f = new TaxiPark(g);
        //System.out.println(f.getPriceOfTaxiPark());
        /*for(int i = 0; i < f.vehicles.length; i++)
            System.out.println(f.toString(f.vehicles[i]));
        f.sortByFuelConsumption();
        for(int i = 0; i < f.vehicles.length; i++)
            System.out.println(f.toString(f.vehicles[i]));*/
        Vehicle[] h;
        h=f.getVehiclesByMaxSpeed(250, 220);

        for(int i = 0; i < h.length; i++)
            System.out.println(h[i].toString());

        /*for(int i = 0; i < f.vehicles.length; i++)
            System.out.println(f.toString(f.vehicles[i]));*/

    }
}
