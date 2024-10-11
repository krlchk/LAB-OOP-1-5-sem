package org.example.vehicle;

public class Car extends Vehicle {
    private int fuelUsage;

    public Car(String brand, String model, int year, int amountOfPassengers, double price, int speed, int fuelUsage) {
        super(brand, model, year, amountOfPassengers, price, speed );
        this.fuelUsage = fuelUsage;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    @Override
    public double getConsumption() {
        return fuelUsage;
    }

    @Override
    public String toString() {
        return super.toString() + "; Fuel usage: " + fuelUsage;
    }
}
