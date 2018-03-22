package at.riag.refugees;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockedAnnotationsCalculatorTest {

    @Mock
    private Calculator calculator;

    @InjectMocks
    private Aggregator aggregator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(MockedAnnotationsCalculatorTest.class);
    }

    @Test
    public void aggregatorShouldCallCalculatorCorrectly() {
        when(calculator.sum(anyInt(), anyInt())).thenReturn(5);

        int aggregate = aggregator.aggregate(1, 2, 3);

        assertEquals(5, aggregate);
        verify(calculator).sum(0, 1);
        verify(calculator).sum(5, 2);
        verify(calculator).sum(5, 3);
    }
}
