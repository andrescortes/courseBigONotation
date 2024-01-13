package algorithm.algoexpert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue16BinarySearchTest {

    private int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
    }

    @Test
    void binarySearch1() {
        int target = 33;
        int expected = 3;
        int actual = Issue16BinarySearch.binarySearch1(array, target);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearch2() {
        int target = 33;
        int expected = 3;
        int actual = Issue16BinarySearch.binarySearch2(array, target);
        assertEquals(expected, actual);
    }
}