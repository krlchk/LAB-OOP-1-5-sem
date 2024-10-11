package org.example;

import org.example.vehicle.Car;
import org.example.vehicle.ElectricCar;
import org.example.vehicle.Vehicle;
import org.example.vehicle.CarPark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        carPark.addVehicle(new Car("BMW", "X5", 2018, 5, 28000, 220, 12));
        carPark.addVehicle(new ElectricCar("Tesla", "Model S", 2021, 5, 15000, 250, 8));
        carPark.addVehicle(new Car("Audi", "A6", 2019, 5, 32000, 240, 10));
        carPark.addVehicle(new ElectricCar("Nissan", "Leaf", 2020, 5, 18000, 145, 7));
        carPark.addVehicle(new Car("Mercedes", "C-Class", 2017, 5, 40000, 210, 9));
        carPark.addVehicle(new ElectricCar("Chevrolet", "Bolt", 2022, 5, 12000, 160, 6));
        carPark.addVehicle(new Car("Ford", "Mustang", 2016, 4, 50000, 250, 14));
        carPark.addVehicle(new ElectricCar("Porsche", "Taycan", 2020, 4, 10000, 270, 9));
        carPark.addVehicle(new Car("Toyota", "Camry", 2018, 5, 30000, 200, 11));
        carPark.addVehicle(new ElectricCar("Hyundai", "Kona Electric", 2021, 5, 20000, 155, 7));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВиберіть опцію:");
            System.out.println("1. Порахувати вартість автопарку");
            System.out.println("2. Провести сортування автомобілів парку за витратою палива");
            System.out.println("3. Знайти автомобіль у компанії, що відповідає заданому діапазону швидкості");
            System.out.println("4. Показати автопарк");
            System.out.println("5. Додати автомобіль");
            System.out.println("6. Видалити автомобіль за індексом");
            System.out.println("7. Вийти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Загальна ціна автопарку складає: " + carPark.getFullPrice() + " $");
                    break;
                case 2:
                    carPark.sortByUsage();
                    System.out.println("Машини відсортовані за витратою пального або заряду:");
                    carPark.showFleet();
                    break;
                case 3:
                    System.out.println("Введіть перший діапазон швидкості:");
                    int firstRange = scanner.nextInt();
                    System.out.println("Введіть другий діапазон швидкості:");
                    int secondRange = scanner.nextInt();
                    System.out.println(carPark.findBySpeed(firstRange, secondRange));
                    break;
                case 4:
                    carPark.showFleet();
                    break;
                case 5:
                    carPark.addVehicleFromInput();
                    break;
                case 6:
                    System.out.println("Введіть індекс автомобіля для видалення:");
                    int index = scanner.nextInt();
                    carPark.removeVehicleByIndex(index);
                    break;
                case 7:
                    System.out.println("Вихід з програми...");
                    return;
                default:
                    System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        }
    }
}
