package at.riag.refugees;

import at.riag.refugees.category.TestCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    public void sumShouldSumValuesCorrectly() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    @Tag("SlowTests")
    public void divideByZeroShouldThrowError() {
        Executable divide = () -> calculator.divide(2, 0);

        assertThrows(ArithmeticException.class, divide);
    }

    @Test
    @Tag(TestCategory.SLOW_TESTS)
    public void divideByZeroShouldThrowErrorWithTimeout() {
        int actualResult = assertTimeout(Duration.ofMillis(100), () -> calculator.divide(2, 1));

        assertEquals(2, actualResult);
    }

    @Test
    public void divideByZeroShouldThrowError3() {
        try {
            calculator.divide(2, 0);
            fail("Fail since no exception was thrown");
        } catch (ArithmeticException ex) {
            //nothing to do here since it's expected behaviour
        }
    }

    @Test
    public void safeDivideShouldDivideCorrectly() {
        assertEquals(5, calculator.safeDivide(15, 3));
    }
}
