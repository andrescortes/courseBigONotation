package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue20SelectionSortTest {

    @Test
    void selectionSort() {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] result = Issue20SelectionSort.selectionSort(array);
        assertArrayEquals(expected, result);
    }
}