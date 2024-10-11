import org.example.vehicle.Car;
import org.example.vehicle.CarPark;
import org.example.vehicle.ElectricCar;
import org.example.vehicle.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.ArrayList;

public class VehicleTest {

    @Test
    public void testGetFullPrice() {
        CarPark carPark = new CarPark();
        Vehicle car1 = new Car("BMW", "X5", 2018, 5, 28000, 220, 12);
        Vehicle car2 = new ElectricCar("Porsche", "Taycan", 2020, 4, 10000, 270, 9);

        carPark.addVehicle(car1);
        carPark.addVehicle(car2);

        double expectedPrice = 38000;
        assertEquals(expectedPrice, carPark.getFullPrice(), 0.01);
    }

    @Test
    public void testFindBySpeedRange() {
        CarPark carPark = new CarPark();
        Vehicle car1 = new Car("BMW", "X5", 2018, 5, 28000, 220, 12);
        Vehicle car2 = new ElectricCar("Porsche", "Taycan", 2020, 4, 10000, 270, 9);
        Vehicle car3 = new Car("Toyota", "Corolla", 2019, 5, 20000, 150, 10);

        carPark.addVehicle(car1);
        carPark.addVehicle(car2);
        carPark.addVehicle(car3);

        String result = carPark.findBySpeed(200, 300);

        assertTrue(result.contains("BMW"));
        assertTrue(result.contains("Porsche"));
        assertFalse(result.contains("Toyota"));
    }

    @Test
    public void testSortByUsage() {
        CarPark carPark = new CarPark();
        Vehicle car1 = new Car("Toyota", "Corolla", 2019, 5, 20000, 150, 10);
        Vehicle car2 = new ElectricCar("Porsche", "Taycan", 2020, 4, 10000, 270, 9);
        Vehicle car3 = new Car("BMW", "X5", 2018, 5, 28000, 220, 12);

        carPark.addVehicle(car1);
        carPark.addVehicle(car2);
        carPark.addVehicle(car3);

        carPark.sortByUsage();

        List<Vehicle> sortedVehicles = carPark.getVehicles();
        assertEquals("Porsche", sortedVehicles.get(0).getBrand());
        assertEquals("Toyota", sortedVehicles.get(1).getBrand());
        assertEquals("BMW", sortedVehicles.get(2).getBrand());
    }

    @Test
    public void testAddAndRemoveVehicleByIndex() {
        CarPark carPark = new CarPark();
        Car car1 = new Car("BMW", "X5", 2018, 5, 28000, 220, 12);
        ElectricCar car2 = new ElectricCar("Tesla", "Model S", 2021, 5, 15000, 250, 8);

        carPark.addVehicle(car1);
        carPark.addVehicle(car2);

        assertEquals(2, carPark.getVehicles().size());

        carPark.removeVehicleByIndex(0);
        assertEquals(1, carPark.getVehicles().size());
        assertEquals("Tesla", carPark.getVehicles().get(0).getBrand());
    }
}

