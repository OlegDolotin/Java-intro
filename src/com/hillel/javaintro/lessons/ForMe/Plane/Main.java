package com.hillel.javaintro.lessons.ForMe.Plane;

public class Main {
    public static void main(String[] args) {
        Wheels a = new Wheels(32, 433,32);
        System.out.println("Pressure -"+ a.getPressure());
        System.out.println("Is pressure low ?"+a.getIsPressureLow());
        a.pumpUpPressureAtTyre(13);

        System.out.println("Pump air in tyre: "+ a.getPressure());
        a.toLowerTheTyrePressureOn(5);
        System.out.println("To lower the tyre pressure on 5    "+ a.getPressure());
        a.toLowerTheTyrePressureTo0();
        System.out.println("To lower the tyre pressure to 0    "+ a.getPressure());
    }
}
