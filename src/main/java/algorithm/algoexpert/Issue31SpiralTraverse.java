package algorithm.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class Issue31SpiralTraverse {

    private Issue31SpiralTraverse() {
    }

    // O(n) time | O(n) space - where n is the length of the input array
    public static List<Integer> spiralTraverse(int[][] array) {
        if (array.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }
            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }
            for (int col = endCol - 1; col >= startCol; col--) {
                // Handle the edge case when there's a single row
                // in the middle of the matrix. In this case, we don't
                // want to double-count the values in this row, which
                // we've already counted in the first for loop above.
                // See Test Case 8 for an example of this edge case.
                if (startRow == endRow) {
                    break;
                }
                result.add(array[endRow][col]);
            }
            for (int row = endRow - 1; row > startRow; row--) {
                // Handle the edge case when there's a single column
                // in the middle of the matrix. In this case, we don't
                // want to double-count the values in this column, which
                // we've already counted in the second for loop above.
                // See Test Case 9 for an example of this edge case.
                if (startCol == endCol) {
                    break;
                }
                result.add(array[row][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }

    // O(n) time | O(n) space - where n is the length of the input array
    public static List<Integer> spiralTraverse2(int[][] array) {
        if (array.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        spiralFill(array, 0, array.length - 1, 0, array[0].length - 1, result);
        return result;
    }

    private static void spiralFill(
            int[][] array,
            int startRow,
            int endRow,
            int startCol,
            int endCol,
            List<Integer> result) {
        if (startRow > endRow || startCol > endCol) {
            return;
        }

        for (int col = startCol; col <= endCol; col++) {
            result.add(array[startRow][col]);
        }
        for (int row = startRow + 1; row <= endRow; row++) {
            result.add(array[row][endCol]);
        }
        for (int col = endCol - 1; col >= startCol; col--) {
            // Handle the edge case when there's a single row
            // in the middle of the matrix. In this case, we don't
            // want to double-count the values in this row, which
            // we've already counted in the first for loop above.
            // See Test Case 8 for an example of this edge case.
            if (startRow == endRow) {
                break;
            }
            result.add(array[endRow][col]);
        }
        for (int row = endRow - 1; row > startRow; row--) {
            // Handle the edge case when there's a single column
            // in the middle of the matrix. In this case, we don't
            // want to double-count the values in this column, which
            // we've already counted in the second for loop above.
            // See Test Case 9 for an example of this edge case.
            if (startCol == endCol) {
                break;
            }
            result.add(array[row][startCol]);
        }
        spiralFill(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, result);
    }
}
