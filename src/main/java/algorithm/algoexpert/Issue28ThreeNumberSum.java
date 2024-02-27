package algorithm.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Issue28ThreeNumberSum {

    private Issue28ThreeNumberSum() {
    }

    // O(n^2) time | O(n) space - where n is the length of the array
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> triplets = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    Integer[] triplet = {array[i], array[left], array[right]};
                    triplets.add(triplet);
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return triplets;
    }
}
