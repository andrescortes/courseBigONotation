package algorithm.challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue1TwoNumberSumTest {

    private Issue1TwoNumberSum twoNumberSum;
    private int[] inputArray;

    @BeforeEach
    void setUp() {
        twoNumberSum = new Issue1TwoNumberSum();
        inputArray = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
    }

    @Test
    void twoNumberSumOptimized() {
        int[] result = twoNumberSum.twoNumberSumOptimized(inputArray, 10);
        assertEquals(11, result[0]);
        assertEquals(-1, result[1]);
    }

    @Test
    void twoNumberSumOptimizedLengthThree() {
        int[] inputArray = new int[]{3, 2, 4};
        int[] result = twoNumberSum.twoNumberSumOptimized(inputArray, 6);
        assertEquals(2, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    void twoNumberSum() {
        int[] numberSum = twoNumberSum.twoNumberSum(inputArray, 10);
        assertEquals(11, numberSum[0]);
        assertEquals(-1, numberSum[1]);

    }

    @Test
    void twoNumberSum2() {
        int[] numberSum = twoNumberSum.twoNumberSum2(inputArray, 10);
        assertEquals(11, numberSum[0]);
        assertEquals(-1, numberSum[1]);
    }

    @Test
    void twoNumberSum3() {
        int[] numberSum = twoNumberSum.twoNumberSum3(inputArray, 10);
        assertEquals(5, numberSum[0]);
        assertEquals(5, numberSum[1]);
    }

    @Test
    void twoNumberSum4() {
        int[] array = new int[]{3,2,4};
        int[] numberSum = twoNumberSum.twoNumberSum5(array, 6);
        assertEquals(1, numberSum[0]);
        assertEquals(2, numberSum[1]);
    }
}