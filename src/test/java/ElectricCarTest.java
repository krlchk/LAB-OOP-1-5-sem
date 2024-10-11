import org.example.vehicle.ElectricCar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElectricCarTest {
    @Test
    public void testGetMake() {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2021, 5, 15000, 250, 8);
        assertEquals("Model S", electricCar.getModel());
    }
    @Test
    public void testGetModel() {
        ElectricCar electricCar = new ElectricCar("Nissan", "Leaf", 2020, 5, 18000, 145, 7);
        assertEquals(2020, electricCar.getYear());

    }
    @Test
    public void testGetConsumption() {
        ElectricCar electricCar = new ElectricCar("Nissan", "Leaf", 2020, 5, 18000, 145, 7);
        assertEquals(7, electricCar.getConsumption());

    }
}
