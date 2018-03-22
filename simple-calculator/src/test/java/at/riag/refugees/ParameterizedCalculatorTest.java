package at.riag.refugees;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedCalculatorTest {

    private int multiplicator;
    private int multiplicand;
    private int result;

    public ParameterizedCalculatorTest(int multiplicator, int multiplicand, int result) {
        this.multiplicator = multiplicator;
        this.multiplicand = multiplicand;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {1, 2, 2},
                {5, 3, 15},
                {121, 4, 484}
        };
        return Arrays.asList(data);
    }


    @Test
    public void multiplicationShouldReturnCorrectResult() {
        assertEquals(result, new Calculator().multiply(multiplicator, multiplicand));
    }
}
