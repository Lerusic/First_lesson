package org.example.first_lesson;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyTest {

    @ParameterizedTest(name = "{0} -> {1} -> {2} -> {3}")
    @CsvSource(
            {
                    "3,1,2,3",
                    "3,2,3,1",
                    "3,3,1,2",
                    "3,3,2,1",
                    "5,5,5,5",
                    "5,5,1,5",
                    "5,5,5,1",
                    "-1,-1,-2,-3",
                    "2147483647, 2147483647, 0, -1"
            }
    )
    void biggerNumber(int expected, int first, int second, int third) {
        assertEquals(expected, Simplify.biggerNumber(first, second, third));

    }
}