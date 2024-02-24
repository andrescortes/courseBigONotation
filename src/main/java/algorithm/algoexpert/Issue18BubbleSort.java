package algorithm.algoexpert;

public class Issue18BubbleSort {

    private Issue18BubbleSort() {
    }


    // Best  O(n) time | O(1) space - because we are not swapping any elements, the array is already sorted
    // Average O(n^2) time | O(1) space
    // Worst  O(n^2) time | O(1) space
    // Sample Input = [8, 5, 2, 9, 5, 6, 3]
    // Sample Output = [2, 3, 5, 5, 6, 8, 9]
    public static int[] bubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        boolean isSorted = false;
        int count = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - count; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                    isSorted = false;
                }
            }
            count++;
        }
        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
