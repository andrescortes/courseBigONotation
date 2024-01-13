package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue16BinarySearchTest {

    @Test
    void binarySearch1() {
        int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;
        int expected = 3;
        int actual = Issue16BinarySearch.binarySearch1(array, target);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearch2() {
        int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;
        int expected = 3;
        int actual = Issue16BinarySearch.binarySearch2(array, target);
        assertEquals(expected, actual);
    }
}