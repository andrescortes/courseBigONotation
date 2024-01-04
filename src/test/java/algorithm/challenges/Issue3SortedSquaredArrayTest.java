package algorithm.challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Issue3SortedSquaredArrayTest {

    private Issue3SortedSquaredArray issue3SortedSquaredArray;
    private int[] inputArray;
    private int[] expectedArray;


    @BeforeEach
    void setUp() {
        issue3SortedSquaredArray = new Issue3SortedSquaredArray();
        inputArray = new int[]{-3, 5, -4, 7, 1, -2, 6};
        expectedArray = new int[]{1, 4, 9, 16, 25, 36, 49};
    }

    @Test
    void sortedSquaredArray() {
        int[] squaredArray = issue3SortedSquaredArray.sortedSquaredArray(inputArray);
        assertArrayEquals(expectedArray, squaredArray);
    }

    @Test
    void sortedSquaredArrayOptimized() {
        int[] squaredArray = issue3SortedSquaredArray.sortedSquaredArrayOptimized(inputArray);
        assertArrayEquals(expectedArray, squaredArray);
    }
}