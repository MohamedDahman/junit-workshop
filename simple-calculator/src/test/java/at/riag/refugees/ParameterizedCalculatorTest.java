package at.riag.refugees;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedCalculatorTest {

    private int a;
    private int b;

    public ParameterizedCalculatorTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {1 , 2},
                { 5, 3 },
                { 121, 4 }
        };
        return Arrays.asList(data);
    }


    @Test
    public void multiplicationShouldReturnCorrectResult() {
        assertEquals(a * b, new Calculator().multiply(a, b));
    }
}
