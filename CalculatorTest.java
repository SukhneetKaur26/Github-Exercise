// CalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Addition addition = new Addition();
        assertEquals(10.0, addition.add(6.0, 4.0));
    }

    @Test
    public void testSubtraction() {
        Subtraction subtraction = new Subtraction();
        assertEquals(2.0, subtraction.subtract(6.0, 4.0));
    }

    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication();
        assertEquals(24.0, multiplication.multiply(6.0, 4.0));
    }
}
