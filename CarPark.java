package org.example;

import org.example.vehicle.Car;
import org.example.vehicle.ElectricCar;
import org.example.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarPark {
    private List<Vehicle> vehicles;

    public CarPark() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public double getFullPrice() {
        double price = 0;
        for (Vehicle vehicle : vehicles) {
            price += vehicle.getPrice();
        }
        return price;
    }

    public void sortByUsage() {
        Collections.sort(vehicles, Comparator.comparingInt(v -> {
            if (v instanceof Car) {
                return ((Car) v).getFuelUsage();
            } else {
                return ((ElectricCar) v).getPowerUsage();
            }
        }));
    }

    public String findBySpeed(int firstRange, int secondRange) {
        StringBuilder result = new StringBuilder();
        boolean found = false;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getSpeed() >= firstRange && vehicle.getSpeed() <= secondRange) {
                result.append(vehicle.getBrand()).append(" | ").append(vehicle.getModel()).append(" | ")
                        .append(vehicle.getSpeed()).append(" км/год\n");
                found = true;
            }
        }

        if (!found) {
            return "В автопарку немає машин у такому діапазоні швидкостей!";
        }

        return result.toString();
    }

    public void showFleet() {
        System.out.println("\nАвтопарк компанії:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getBrand() + " " + vehicle.getModel() + ", Рік: " + vehicle.getYear() +
                    ", Ціна: " + vehicle.getPrice() + " $, Швидкість: " + vehicle.getSpeed() +
                    " км/год, Витрата: " + vehicle.getConsumption());
        }
    }
}