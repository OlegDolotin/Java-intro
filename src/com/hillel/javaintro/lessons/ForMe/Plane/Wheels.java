package com.hillel.javaintro.lessons.ForMe.Plane;

public class Wheels {
    private double width, diameter, radius;
    private String typeOfTyre;
    private double pressure = 0;
    private boolean isPressureLow = (this.pressure < 14.0)? true : false;
    private String typeOfAirAtTyres;
    Wheels(double width, double diameter, double radius){
        this.width = width;
        this.diameter = diameter;
        this.radius = radius;
    }

    public double getWidth() {
        return width;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return radius;
    }

    public double getPressure() {
        return pressure;
    }

    public String getTypeOfAirAtTyres() {
        return typeOfAirAtTyres;
    }

    public String getTypeOfTyre() {
        return typeOfTyre;
    }

    public void setTypeOfAirAtTyres(String typeOfAirAtTyres) {
        this.typeOfAirAtTyres = typeOfAirAtTyres;
    }

    public void setTypeOfTyre(String typeOfTyre) {
        this.typeOfTyre = typeOfTyre;
    }

    public void pumpUpPressureAtTyre(double pressure){
        if(this.pressure + pressure >= 20)
            return;
        this.pressure += pressure;
    }

    public void toLowerTheTyrePressureOn(double n){
        if(this.pressure - n <= 0)
            return;
        this.pressure -= n;
    }

    public void toLowerTheTyrePressureTo0(){
        this.pressure = 0;
    }

    public boolean getIsPressureLow(){
        return this.isPressureLow;
    }
}
