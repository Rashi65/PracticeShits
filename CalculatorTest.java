import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Mocking the Calculator interface
        Calculator calculatorMock = mock(Calculator.class);

        // Setting up the behavior of the mock
        when(calculatorMock.add(2, 3)).thenReturn(5);

        // Calling the mocked method
        int result = calculatorMock.add(2, 3);

        // Verifying the result
        assert(result == 5);
    }
}
