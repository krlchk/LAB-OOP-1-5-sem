package org.example.vehicle;

public class ElectricCar extends Vehicle {
    private int powerUsage;

    public ElectricCar(String make, String model, int year, int amountOfPassengers, double price, int speed, int powerUsage) {
        super(make, model, year, amountOfPassengers, price,speed);
        this.powerUsage = powerUsage;

    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    @Override
    public String toString() {
        return super.toString() + "; Power usage: " + powerUsage;
    }
}
