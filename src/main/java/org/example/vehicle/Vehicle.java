package org.example.vehicle;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private int amountOfPassengers;
    private double price;
    private int speed;

    public Vehicle(String brand, String model, int year, int amountOfPassengers, double price, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.amountOfPassengers = amountOfPassengers;
        this.price = price;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public abstract double getConsumption();

    @Override
    public String toString() {
        return "Brand: " + brand +
                "; Model: " +model+
                "; Year: " +year+
                "; Amount of passengers: " +amountOfPassengers+
                "; Price: " +price +
                "; Speed: " +speed;
    }
}
