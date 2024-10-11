package org.example.vehicle;

public class ElectricCar extends Vehicle {
    private int powerUsage;

    public ElectricCar(String brand, String model, int year, int amountOfPassengers, double price, int speed, int powerUsage) {
        super(brand, model, year, amountOfPassengers, price,speed);
        this.powerUsage = powerUsage;

    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    @Override
    public double getConsumption() {
        return powerUsage;
    }

    @Override
    public String toString() {
        return super.toString() + "; Power usage: " + powerUsage;
    }
}
