// CalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication();
        assertEquals(24.0, multiplication.multiply(6.0, 4.0));
    }
}
