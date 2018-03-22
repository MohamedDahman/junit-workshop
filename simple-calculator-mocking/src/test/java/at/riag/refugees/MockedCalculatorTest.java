package at.riag.refugees;

import at.riag.refugees.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockedCalculatorTest {

    @Test
    public void mockedCalculatorShouldReturnMockedValue() {
        Calculator calculator = Mockito.mock(Calculator.class);

        when(calculator.sum(1,1)).thenReturn(10);

        assertEquals(10, calculator.sum(1, 1));
    }

    @Test
    public void mockedCalculatorWithMatchersShouldReturnMockedValue() {
        Calculator calculator = Mockito.mock(Calculator.class);

        when(calculator.sum(anyInt(),anyInt())).thenReturn(10);

        assertEquals(10, calculator.sum(1, 1));
        assertEquals(10, calculator.sum(2, 56));
    }

    @Test(expected = ArithmeticException.class)
    public void mockedCalculatorShouldThrowException() {
        Calculator calculator = Mockito.mock(Calculator.class);

        when(calculator.sum(anyInt(),anyInt())).thenThrow(new ArithmeticException());

        calculator.sum(1, 1);
    }
}
