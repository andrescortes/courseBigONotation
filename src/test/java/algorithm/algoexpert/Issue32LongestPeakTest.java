package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue32LongestPeakTest {
    private static final int[] ARRAY = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};

    @Test
    void longestPeak() {
        assertEquals(6, Issue32LongestPeak.longestPeak(ARRAY));
    }
}