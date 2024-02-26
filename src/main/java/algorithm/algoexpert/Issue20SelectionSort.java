package algorithm.algoexpert;

public class Issue20SelectionSort {

    private Issue20SelectionSort() {}

    // Best: O(n^2) time | O(1) space
    // Average: O(n^2) time | O(1) space
    // Worst: O(n^2) time | O(1) space
    // input array = [8, 5, 2, 9, 5, 6, 3]
    // output = [2, 3, 5, 5, 6, 8, 9]
    public static int[] selectionSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int startIdx = 0;
        while (startIdx < array.length - 1) {
            int smallestIdx = startIdx;
            for (int i = startIdx + 1; i < array.length; i++) {
                if (array[smallestIdx] > array[i]) {
                    smallestIdx = i;
                }
            }
            swap(array, startIdx, smallestIdx);
            startIdx++;
        }
        return array;
    }

    private static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
