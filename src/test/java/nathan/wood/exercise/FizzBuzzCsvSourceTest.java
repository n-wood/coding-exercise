package nathan.wood.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Given the FizzBuzz application")
public class FizzBuzzCsvSourceTest {

    FizzBuzz unit;

    @BeforeEach
    public void setUp()
    {
        unit = new FizzBuzz();
    }

    @DisplayName("When a number is is supplied to the application")
    @Nested
    class CsvDrivenTest {
        @DisplayName("Then the output will be the original number, Fizz, Buzz or FizzBuzz")
        @ParameterizedTest(name = "And {0} returns {1}")
        @CsvFileSource(resources = "/data.csv")
        public void testByParam(int input, String expected) {
            assertEquals(expected, unit.fizzBuzz(input));
        }
    }
}
