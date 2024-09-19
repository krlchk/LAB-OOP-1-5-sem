package org.example.vehicle;

public class Car extends Vehicle {
    private int fuelUsage;

    public Car(String make, String model, int year, int amountOfPassengers, double price, int speed, int fuelUsage) {
        super(make, model, year, amountOfPassengers, price, speed );
        this.fuelUsage = fuelUsage;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    @Override
    public String toString() {
        return super.toString() + "; Fuel usage: " + fuelUsage;
    }
}
