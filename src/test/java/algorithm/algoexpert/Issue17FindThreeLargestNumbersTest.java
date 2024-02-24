package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue17FindThreeLargestNumbersTest {

    @Test
    void findThreeLargestNumbers() {
        int[] array = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        int[] threeLargest = Issue17FindThreeLargestNumbers.findThreeLargestNumbers(array);
        assertEquals(18, threeLargest[0]);
        assertEquals(141, threeLargest[1]);
        assertEquals(541, threeLargest[2]);
    }

    @Test
    void findThreeLargestNumbers2() {
        int[] array = {55, 7, 78, 12, 42};
        int[] threeLargest = Issue17FindThreeLargestNumbers.findThreeLargestNumbers(array);
        assertEquals(42, threeLargest[0]);
        assertEquals(55, threeLargest[1]);
        assertEquals(78, threeLargest[2]);
    }
}