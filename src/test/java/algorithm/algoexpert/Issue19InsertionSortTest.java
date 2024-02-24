package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue19InsertionSortTest {

    @Test
    void insertionSort() {
        //calculate time to run
        long start = System.nanoTime();
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] actual = Issue19InsertionSort.insertionSort(array);
        long end = System.nanoTime();
        System.out.println("Time to run: " + (end - start) + " nanoseconds");
        assertArrayEquals(expected, actual);
    }
}