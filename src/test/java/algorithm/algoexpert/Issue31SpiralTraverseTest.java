package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue31SpiralTraverseTest {
    private final int[][] ARRAY = {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
    };


    @Test
    void spiralTraverse() {
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> actual = Issue31SpiralTraverse.spiralTraverse(ARRAY);

        assertEquals(expected, actual);
    }

    @Test
    void spiralTraverse2() {
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> actual = Issue31SpiralTraverse.spiralTraverse2(ARRAY);

        assertEquals(expected, actual);
    }
}