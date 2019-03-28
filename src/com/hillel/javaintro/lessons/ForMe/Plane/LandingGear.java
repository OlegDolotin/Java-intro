package com.hillel.javaintro.lessons.ForMe.Plane;

public class LandingGear {
    private int countOfChassis;
    private boolean isTheLandingGearRetracted;
    private String typeOfLandingGear;
    LandingGear(String typeOfLandingGear){
        this.typeOfLandingGear = typeOfLandingGear;
        isTheLandingGearRetracted = false;
        countOfChassis++;
    }

    private int getCountOfChassis() {
        return countOfChassis;
    }

    private boolean IsTheLandingGearRetracted() {
        return isTheLandingGearRetracted;
    }

    private String getTypeOfLandingGear() {
        return typeOfLandingGear;
    }

    public void setTypeOfLandingGear(String typeOfLandingGear) {
        this.typeOfLandingGear = typeOfLandingGear;
    }

    public void retractTheLandingGear(){
        this.isTheLandingGearRetracted = true;
        System.out.println("The landing gear was retracted!");
    }

    public void deployTheLandingGear(){
        this.isTheLandingGearRetracted = false;
        System.out.println("The landing gear was deployed!");
    }
}
