package org.example.hw5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource(
            {
                    "Fizz, 1",
                    "Fizz, 3",
                    "Fizz, 5",
                    "Fizz, 15",
                    "Fizz, 30",
                    "Fizz, 98",
                    "Fizz, 2",
                    "Fizz, 9",
                    "Fizz, 25",
                    "Fizz, 45",
                    "Fizz, 13",
                    "Fizz, 100",
                    "Fizz, 0",
                    "Fizz, -15",
            }
    )
    void shouldReturnFizzFor3(String expectedResult, int input) {
        assertEquals(expectedResult, FizzBuzz.fizzBuzz(input));
    }
    @Test
    void shouldThrowExceptionFor666(){
        assertThrows(IllegalArgumentException.class,() ->FizzBuzz.fizzBuzz(666));
    }
    @Test
    void shouldThrowExceptionFor6661(){
        assertThrows(IllegalArgumentException.class,() ->FizzBuzz.fizzBuzz(665));
    }
    @Test
    void shouldThrowExceptionFor6662(){
        assertThrows(NullPointerException.class,() ->FizzBuzz.fizzBuzz(666));
    }
}