import org.example.vehicle.Car;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testGetMake() {
        Car car = new Car("BMW", "X5", 2018, 5, 28000, 220, 12);
        assertEquals("BMW", car.getBrand());
    }

    @Test
    public void testGetModel() {
        Car car = new Car("BMW", "X5", 2018, 5, 28000, 220, 12);
        assertEquals("X5", car.getModel());
    }

    @Test
    public void testGetConsumption() {
        Car car = new Car("BMW", "X5", 2018, 5, 28000, 220, 12);
        assertEquals(12, car.getConsumption(), 0.01);
    }

}
