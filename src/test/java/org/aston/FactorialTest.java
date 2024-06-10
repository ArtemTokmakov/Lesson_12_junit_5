package org.aston;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class FactorialTest {

    @DisplayName("Проверка факториала для положительных чисел")
    @ParameterizedTest(name = "Факториал {0} равен {1}")
    @MethodSource("provideFactorialData")
    void testCalculateFactorial(int n, int expected) {
        assertEquals(expected, Factorial.calculateFactorial(n));
    }

    static Stream<Arguments> provideFactorialData() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 6),
                Arguments.of(4, 24),
                Arguments.of(5, 120),
                Arguments.of(6, 720),
                Arguments.of(7, 5040),
                Arguments.of(8, 40320),
                Arguments.of(9, 362880),
                Arguments.of(10, 3628800)
        );
    }

    @Test
    @DisplayName("Проверка на отрицательные числа")
    void testCalculateFactorialWithNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-1));
    }
}