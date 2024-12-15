package org;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmUtilsTest {

    @Test
    public void testFindMinPositive_success() {
        int[] array = {3, 7, 2, 5, 10, 8};
        assertEquals(2, AlgorithmUtils.findMinPositive(array));
    }

    @Test
    public void testFindMinPositive_noPositiveElements() {
        int[] array = {-3, -7, -2, -5, -4, -10};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AlgorithmUtils.findMinPositive(array);
        });
        assertEquals("Array cannot contain only negative values.", exception.getMessage());
    }

    @Test
    public void testFindMinPositive_emptyArray() {
        int[] array = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AlgorithmUtils.findMinPositive(array);
        });
        assertEquals("Array cannot be null or empty.", exception.getMessage());
    }


    @Test
    public void testFindMinPositive_nullArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AlgorithmUtils.findMinPositive(null);
        });
        assertEquals("Array cannot be null or empty.", exception.getMessage());
    }

    @Test
    public void testSumNegativeElements_success() {
        int[] array = {-3, -7, -2, -5, -4};
        assertEquals(-21, AlgorithmUtils.sumNegativeNumbers(array));
    }

    @Test
    public void testSumNegativeElements_noNegativeElements() {
        int[] array = {3, 7, 2, 5, 4};
        assertEquals(0, AlgorithmUtils.sumNegativeNumbers(array));
    }

    @Test
    public void testFibonacci_success() {
        assertEquals(0, AlgorithmUtils.fibonacci(0));
        assertEquals(1, AlgorithmUtils.fibonacci(1));
        assertEquals(21, AlgorithmUtils.fibonacci(8));
    }

    @Test
    public void testFibonacci_negativeIndex() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AlgorithmUtils.fibonacci(-1);
        });
        assertEquals("Index cannot be negative", exception.getMessage());
    }

    @Test
    public void testCalculateCurrent_success() {
        assertEquals(2.0, AlgorithmUtils.calculateCurrent(10, 5));
        assertEquals(0.5, AlgorithmUtils.calculateCurrent(1, 2));
    }

    @Test
    public void testCalculateCurrent_zeroResistance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AlgorithmUtils.calculateCurrent(10, 0);
        });
        assertEquals("Resistance must be positive", exception.getMessage());
    }
}
