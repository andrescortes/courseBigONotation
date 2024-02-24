package algorithm.algoexpert;

public class Issue19InsertionSort {

    private Issue19InsertionSort() {
    }

    // Best  O(n) time | O(1) space
    // Average O(n^2) time | O(1) space
    // Worst  O(n^2) time | O(1) space
    // Sample Input = [8, 5, 2, 9, 5, 6, 3]
    // Sample Output = [2, 3, 5, 5, 6, 8, 9]
    public static int[] insertionSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                j--;
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
