package algorithm.algoexpert;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Issue3SortedSquaredArray {


    // O(n log n) time | O(n) space - where n is the length of the input array
    public int[] sortedSquaredArray(int[] inputArray) {
        int[] sortedSquaredArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            sortedSquaredArray[i] = inputArray[i] * inputArray[i];
        }
        Arrays.sort(sortedSquaredArray);
        return sortedSquaredArray;
    }

    // O(n) time | O(n) space - where n is the length of the input array
    public int[] sortedSquaredArrayOptimized(int[] inputArray) {
        int[] array = IntStream.of(inputArray).sorted().toArray();
        // must be sorted in ascending order
        int[] sortedSquaredArray = new int[inputArray.length];
        int left = 0;
        int right = inputArray.length - 1;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            int smallerValue = Math.abs(array[left]);
            int largerValue = Math.abs(array[right]);
            if (smallerValue > largerValue) {
                sortedSquaredArray[i] = smallerValue * smallerValue;
                left++;
            } else {
                sortedSquaredArray[i] = largerValue * largerValue;
                right--;
            }
        }
        return sortedSquaredArray;
    }
}
