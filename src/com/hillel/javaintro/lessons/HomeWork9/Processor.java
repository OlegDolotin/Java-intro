package com.hillel.javaintro.lessons.HomeWork9;

public class Processor {

    Car[] arrOfCars;

    Processor(Car[] arrOfCars) {
        this.arrOfCars = arrOfCars;
    }

    Processor() {
        this.arrOfCars = null;
    }

    public void listOfCarOneBrand(String brand) {
        listOfCarOneBrand(this.arrOfCars, brand);
    }

    public void listOfCarOneBrand(Car[] arrOfCars, String brand) {
        for (int i = 0; i < arrOfCars.length; i++)
            if (arrOfCars[i].carBrand.equalsIgnoreCase(brand)) {
                print(arrOfCars[i]);
            }
    }


    public void listOfTheModelOfCarsWhichUseMoreThanNYear(String model, int n) {
        listOfTheModelOfCarsWhichUseMoreThanNYear(this.arrOfCars, model, n);
    }


    public void listOfTheModelOfCarsWhichUseMoreThanNYear(Car[] cars, String model, int n) {
        int year = 2019;
        for (int i = 0; i < cars.length; i++)
            if (cars[i].carModel.equalsIgnoreCase(model) && year - cars[i].yearOfManufacture > n)
                print(cars[i]);
    }


    public void listOfTheCarsWhichWereManufacturedInCartainYearAndPriceOfWhichIsBiggerThanN(Car[] arrOfCars, int year, int n) {
        for (int i = 0; i < arrOfCars.length; i++)
            if (arrOfCars[i].yearOfManufacture == year && arrOfCars[i].carPrice > n)
                print(arrOfCars[i]);
    }


    public void listOfTheCarsWhichWereManufacturedInCartainYearAndPriceOfWhichIsBiggerThanN(int year, int n) {
        listOfTheCarsWhichWereManufacturedInCartainYearAndPriceOfWhichIsBiggerThanN(this.arrOfCars, year, n);
    }


    public void print(Car cars) {
        System.out.print("{ id: " + cars.id + " brand: " + cars.carBrand + " model: " + cars.carModel + " price: " + cars.carPrice);
        System.out.println(" color: " + cars.carColor + " year of manufacture: " + cars.yearOfManufacture);
        System.out.println(" car registration number: " + cars.carRegistrationNumber + " }");
    }


    public Car[] filling(Car[] cars) {

        cars[0] = new Car(16546, "Tesla", "3", 2016, "Black", 35000, "M999MM");
        cars[1] = new Car(46621, "Tesla", "X", 2016, "Grey", 85000, "H004BP");
        cars[2] = new Car(46462, "Tesla", "3", 2018, "SpaceGrey", 33000, "H986HH");
        cars[3] = new Car(46433, "Tesla", "X", 2015, "Red", 110000, "E123CC");
        cars[4] = new Car(44462, "Mercedes", "AMG G 63", 2015, "Black", 261000, "K474CM");
        cars[5] = new Car(56790, "BMW", "M3", 2007, "Blue", 35000, "O010AO");
        cars[6] = new Car(56543, "lamborghini", "URUS", 2018, "Red", 420000, "3SAM123");
        cars[7] = new Car(65313, "Audi", "R8", 2017, "DeepBlue", 200000, "A206AA");
        cars[8] = new Car(54324, "Skoda", "SuperB", 2018, "DeepBlack", 33000, "M277AK");
        cars[9] = new Car(67778, "Ford", "Mustang GT", 2016, "Red", 40000, "T444BE");
        return cars;
    }
}
