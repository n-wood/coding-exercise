package nathan.wood.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Given the FizzBuzz application")
public class FizzBuzzTest {

    FizzBuzz unit;

    @BeforeEach
    public void setUp()
    {
        unit = new FizzBuzz();
    }

    @DisplayName("When a number is divisible by 3")
    @Nested
    class Fizzers {
        @DisplayName("Then the output will be Fizz")
        @ParameterizedTest (name = "And {0} returns Fizz")
        @ValueSource(ints = {3,6,9,12})
        public void testDivBy3(int number)
        {
            assertEquals("Fizz", unit.fizzBuzz(number));
        }

    }
    @DisplayName("When a number is divisible by 5")
    @Nested
    class Buzzers {
        @ParameterizedTest (name = "And {0} returns Buzz")
        @ValueSource(ints = {5,10,20,25})
        @DisplayName("Then the output will be Buzz")
        public void testDivBy5(int number)
        {
            assertEquals("Buzz", unit.fizzBuzz(number));
        }
    }

    @DisplayName("When a number is divisible by 3 and 5")
    @Nested
    class FizzBuzzers {
        @DisplayName("Then the output will be FizzBuzz")
        @ParameterizedTest (name = "And {0} returns FizzBuzz")
        @ValueSource(ints = {15,30})
        public void testDivBy3and5(int number)
        {
            assertEquals("FizzBuzz", unit.fizzBuzz(number));
        }
    }

    @DisplayName("When a number is NOT divisible by 3 or 5")
    @Nested
    class NotFizzOrBuzzOrFizzBuzz {
        @DisplayName("Then the output will be the input returned")
        @ParameterizedTest (name = "And {0} returns {0}")
        @ValueSource(ints = {1,2,4,7,8})
        public void testNotFizzOrBuzz(int number)
        {
            assertEquals(String.valueOf(number), unit.fizzBuzz(number));
        }
    }







}
