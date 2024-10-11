package org.example.vehicle;

import org.example.vehicle.Car;
import org.example.vehicle.ElectricCar;
import org.example.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CarPark {
    private List<Vehicle> vehicles;

    public CarPark() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicleFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть марку автомобіля:");
        String brand = scanner.nextLine();

        System.out.println("Введіть модель автомобіля:");
        String model = scanner.nextLine();

        System.out.println("Введіть рік випуску:");
        int year = scanner.nextInt();

        System.out.println("Введіть кількість місць:");
        int seats = scanner.nextInt();

        System.out.println("Введіть ціну:");
        double price = scanner.nextDouble();

        System.out.println("Введіть максимальну швидкість:");
        int speed = scanner.nextInt();

        System.out.println("Введіть витрату (літрів або кВт/год):");
        int consumption = scanner.nextInt();

        System.out.println("Автомобіль є електричним? (true/false):");
        boolean isElectric = scanner.nextBoolean();

        Vehicle vehicle;
        if (isElectric) {
            vehicle = new ElectricCar(brand, model, year, seats, price, speed, consumption);
        } else {
            vehicle = new Car(brand, model, year, seats, price, speed, consumption);
        }

        vehicles.add(vehicle);
        System.out.println("Автомобіль додано до автопарку.");
    }

    public void removeVehicleByIndex(int index) {
        if (index >= 0 && index < vehicles.size()) {
            vehicles.remove(index);
            System.out.println("Автомобіль видалено з автопарку.");
        } else {
            System.out.println("Неправильний індекс!");
        }
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