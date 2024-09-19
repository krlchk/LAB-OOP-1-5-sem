package org.example.vehicle;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int amountOfPassengers;
    private double price;
    private int speed;

    public Vehicle(String make, String model, int year, int amountOfPassengers, double price, int speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.amountOfPassengers = amountOfPassengers;
        this.price = price;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Make: " + make +
                "; Model: " +model+
                "; Year: " +year+
                "; Amount of passengers: " +amountOfPassengers+
                "; Price: " +price +
                "; Speed: " +speed;
    }
}
