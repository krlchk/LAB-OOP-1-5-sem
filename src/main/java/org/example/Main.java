package org.example;

import org.example.vehicle.Car;
import org.example.vehicle.ElectricCar;
import org.example.vehicle.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle[] cars = new Vehicle[] {
                new Car("BMW", "X5", 2018, 5, 28000, 210, 12),
                new ElectricCar("BMW", "X5", 2018, 5, 28000, 210, 11),
                new Car("BMW", "X5", 2018, 5, 28000, 210, 13),
                new ElectricCar("BMW", "X5", 2018, 5, 28000, 210, 8),
                new Car("BMW", "X5", 2018, 5, 28000, 210, 10)
        };
        System.out.println(getFullPrice(cars));
        sortByUsage(cars);
        for (Vehicle v : cars) {
            System.out.println(v);
        }
    }

    public static double getFullPrice(Vehicle[] vehicles) {
        double price = 0;
        for (Vehicle vehicle : vehicles) {
            price += vehicle.getPrice();
        }
        return price;
    }

    public static void sortByUsage(Vehicle[] vehicles) {
        for (int i = vehicles.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int usage1, usage2;
                if (vehicles[j] instanceof Car) {
                    usage1 = ((Car)vehicles[j]).getFuelUsage();
                } else {
                    usage1 = ((ElectricCar)vehicles[j]).getPowerUsage();
                }
                if (vehicles[j + 1] instanceof Car) {
                    usage2 = ((Car)vehicles[j + 1]).getFuelUsage();
                } else {
                    usage2 = ((ElectricCar)vehicles[j + 1]).getPowerUsage();
                }
                if (usage1 > usage2) {
                    Vehicle temp = vehicles[j];
                    vehicles[j] = vehicles[j + 1];
                    vehicles[j + 1] = temp;
                }
            }
        }
    }
}