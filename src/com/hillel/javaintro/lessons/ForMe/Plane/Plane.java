package com.hillel.javaintro.lessons.ForMe.Plane;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plane {
    private int priceOfPlane;
    private List<String> route = new ArrayList<String>();
    private String whatIsItDoing;
    private Wing[] wings;
    private Engine engine;
    private LandingGear[] landingGears;
    private Wheels[] wheels;
    Plane(int priceOfPlane){
        this.priceOfPlane = priceOfPlane;
    }
    Plane(int priceOfPlane, Wing[] wings, Engine engine, LandingGear[] landingGears, Wheels[] wheels){
        this.priceOfPlane = priceOfPlane;
        this.wings = wings;
        this.engine = engine;
        this.landingGears = landingGears;
        this.wheels = wheels;
    }

    public int getPriceOfPlane() {
        return priceOfPlane;
    }

    public String getWhatIsItDoing() {
        return whatIsItDoing;
    }

    public void assignedRoute(){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter point count of route: ");
        int pointCountOfRoute = read.nextInt();
        for(int i = 0; i < pointCountOfRoute; i++){
            System.out.print("Enter point: ");
            this.route.add(read.nextLine());
            System.out.println();
        }
    }

    public void printTheRoute(){
        for(String i:this.route){
            int k = 0;
            System.out.println(k+++". "+i);
        }
    }

    public void sendPlaneInFlight(){
        this.whatIsItDoing = "Now, it is flying";
    }

    public void setWhatIsItDoing(String whatIsItDoing) {
        this.whatIsItDoing = whatIsItDoing;
    }
}
