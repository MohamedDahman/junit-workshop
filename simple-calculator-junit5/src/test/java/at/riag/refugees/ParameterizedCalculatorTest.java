package at.riag.refugees;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.assertEquals;

public class ParameterizedCalculatorTest {

    public static int[][] data() {
        return new int[][] {
                {1, 2, 2},
                {5, 3, 15},
                {121, 4, 484}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void multiplicationShouldReturnCorrectResult(int[] data) {
        assertEquals(data[2], new Calculator().multiply(data[0], data[1]));
    }
}
