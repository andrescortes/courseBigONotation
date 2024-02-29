package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue30MonotonicArrayTest {

    @Test
    void isMonotonic() {
        int[] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};

        assertTrue(Issue30MonotonicArray.isMonotonic(array));
    }

    @Test
    void isMonotonic2() {
        int[] array = {1, 5, 10, 1100, 1100, 1101, 1102, 9001};

        assertTrue(Issue30MonotonicArray.isMonotonic(array));
    }

    @Test
    void isMonotonic3() {
        int[] array = {1,2};

        assertTrue(Issue30MonotonicArray.isMonotonic(array));
    }

    @Test
    void isMonotonic4() {
        int[] array = {1, 5, 10, 1100, 1100, 1101, 1102, 9001};

        assertTrue(Issue30MonotonicArray.isMonotonic2(array));
    }

    @Test
    void isMonotonic5() {
        int[] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};

        assertTrue(Issue30MonotonicArray.isMonotonic2(array));
    }
}