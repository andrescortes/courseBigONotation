package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue27SmallestDifferenceTest {

    @Test
    void smallestDifference() {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        int[] smallestDifference = Issue27SmallestDifference
                .smallestDifference(arrayOne, arrayTwo);
        assertArrayEquals(new int[]{28, 26}, smallestDifference);
    }

    @Test
    void smallestDifference2() {
        int[] arrayOne = {10, 0, 20, 25,2200};
        int[] arrayTwo = {1005, 1006, 1014, 1032, 1031};
        int[] smallestDifference = Issue27SmallestDifference
                .smallestDifference(arrayOne, arrayTwo);
        assertArrayEquals(new int[]{25, 1005}, smallestDifference);
    }
}