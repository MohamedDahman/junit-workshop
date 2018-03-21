package at.riag.refugees;

import at.riag.refugees.category.SlowTests;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Calculator calculator;

    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    public void sumShouldSumValuesCorrectly() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test(timeout = 100)
    @Category(SlowTests.class)
    public void divideByZeroShouldThrowError() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");

        calculator.divide(2, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroShouldThrowError2() {
        calculator.divide(2, 0);
    }

    @Test
    public void divideByZeroShouldThrowError3() {
        try {
            calculator.divide(2, 0);
            fail();
        } catch (ArithmeticException ex) {
            //nothing to do here since it's expected behaviour
        }
    }

    @Test
    public void safeDivideShouldDivideCorrectly() {
        assertEquals(5, calculator.safeDivide(15, 3));
    }
}
