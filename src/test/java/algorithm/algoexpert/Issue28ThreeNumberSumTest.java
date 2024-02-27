package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Issue28ThreeNumberSumTest {

    @Test
    void threeNumberSum() {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        List<Integer[]> expected = List.of(
                new Integer[]{-8, 2, 6},
                new Integer[]{-8, 3, 5},
                new Integer[]{-6, 1, 5}
        );

        List<Integer[]> actual = Issue28ThreeNumberSum.threeNumberSum(array, targetSum);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void threeNumberSum2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int targetSum = 18;
        List<Integer[]> expected = List.of(
                new Integer[]{1, 2, 15},
                new Integer[]{1, 8, 9},
                new Integer[]{2, 7, 9},
                new Integer[]{3, 6, 9},
                new Integer[]{3, 7, 8},
                new Integer[]{4, 5, 9},
                new Integer[]{4, 6, 8},
                new Integer[]{5, 6, 7}
        );

        List<Integer[]> actual = Issue28ThreeNumberSum.threeNumberSum(array, targetSum);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}