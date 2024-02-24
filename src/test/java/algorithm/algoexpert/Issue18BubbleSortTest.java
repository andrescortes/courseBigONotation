package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Issue18BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        int[] result = Issue18BubbleSort.bubbleSort(array);
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
        assertEquals(5, result[2]);
        assertEquals(5, result[3]);
        assertEquals(6, result[4]);
        assertEquals(8, result[5]);
        assertEquals(9, result[6]);
    }
}