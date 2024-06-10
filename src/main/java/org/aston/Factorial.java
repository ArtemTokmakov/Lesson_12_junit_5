package org.aston;

public class Factorial {

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        return n * calculateFactorial(n - 1);
    }
}