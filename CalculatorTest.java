// CalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSubtraction() {
        Subtraction subtraction = new Subtraction();
        assertEquals(2.0, subtraction.subtract(6.0, 4.0));
    }
}
