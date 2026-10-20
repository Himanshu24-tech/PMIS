// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertThrows;

// import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final calculator calculator = new calculator();

    @Test
    public void testAddition() {
        assertEquals(15.0, calculator.add(10.0, 5.0), 0.0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(5.0, calculator.subtract(10.0, 5.0), 0.0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(50.0, calculator.multiply(10.0, 5.0), 0.0);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(10.0, 5.0), 0.0);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10.0, 0.0));
    }
}
