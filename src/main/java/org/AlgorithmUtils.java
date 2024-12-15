package org;

import java.util.List;

public class AlgorithmUtils {

    // 1. Пошук мінімального елементу масиву позитивних чисел
    public static int findMinPositive(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int min = Integer.MAX_VALUE;
        boolean hasPositive = false;

        for (int num : array) {
            if (num > 0) {
                min = Math.min(min, num);
                hasPositive = true;
            }
        }

        if (!hasPositive) {
            throw new IllegalArgumentException("Array cannot contain only negative values.");
        }
        return min;
    }

    // 2. Розрахунок суми елементів масиву, який може складатися лише з від’ємних чисел
    public static int sumNegativeNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num < 0) {
                sum += num;
            }
        }
        return sum;
    }

    // 3. Алгоритм розрахунку N-го елементу послідовності Фібоначчі
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    // 4. Алгоритм розрахунку сили струму на ділянці кола
    public static double calculateCurrent(double voltage, double resistance) {
        if (resistance <= 0) {
            throw new IllegalArgumentException("Resistance must be positive");
        }
        return voltage / resistance;
    }
}
