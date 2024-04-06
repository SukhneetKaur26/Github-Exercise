// CalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Addition addition = new Addition();
        assertEquals(10.0, addition.add(6.0, 4.0));
    }
}
