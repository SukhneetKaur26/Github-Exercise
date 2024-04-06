import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner; // add inline comment

public class CalculatorTest {

    @Test
    public void testAddition() {
        String input = "3\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(8.0, new Addition().performOperation(new Scanner(System.in)));
    }

    @Test
    public void testSubtraction() {
        String input = "7\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(4.0, new Subtraction().performOperation(new Scanner(System.in)));
    }

    @Test
    public void testMultiplication() {
        String input = "4\n6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(24.0, new Multiplication().performOperation(new Scanner(System.in)));
    }
}
