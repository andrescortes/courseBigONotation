package algorithm.algoexpert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Issue1TwoNumberSum {

    // O(log(n) time | O(1) space
    public int[] twoNumberSumOptimized(int[] inputArray, int target) {
        int left = 0;
        int right = inputArray.length - 1;
        while (left < right) {
            int sum = inputArray[left] + inputArray[right];
            if (sum == target) {
                return new int[]{inputArray[left], inputArray[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    // O(nlog(n)) time | O(1) space
    public int[] twoNumberSum(int[] inputArray, int target) {
        int left = inputArray[0];
        int right = inputArray[inputArray.length - 1];
        int length = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            int sum = left + right;
            if (sum == target) {
                return new int[]{left, right};
            }
            if (sum > target) {
                length -= 1;
                right = inputArray[length];
            }
            if (sum < target && (i + 1) < length) {
                left = inputArray[i + 1];
            }
        }
        return new int[]{};
    }

    // O(n^2) time | O(1) space
    public int[] twoNumberSum2(int[] inputArray, int target) {
        for (int i = 0; i < inputArray.length; i++) {
            int firstNumber = inputArray[i];
            for (int j = i + 1; j < inputArray.length; j++) {
                int secondNumber = inputArray[j];
                if (firstNumber + secondNumber == target) {
                    return new int[]{firstNumber, secondNumber};
                }
            }
        }
        return new int[]{};
    }

    // O(n) time | O(n) space
    public int[] twoNumberSum3(int[] inputArray, int target) {
        List<Integer> integerList = IntStream.of(inputArray).boxed().collect(Collectors.toList());
        for (int firstNumber : inputArray) {
            int potentialNumber = target - firstNumber;
            if (integerList.contains(potentialNumber)) {
                return new int[]{firstNumber, potentialNumber};
            }
        }
        return new int[]{};
    }

    // O(n) time | O(n) space
    public int[] twoNumberSum4(int[] inputArray, int target) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int j : inputArray) {
            int potentialNumber = target - j;
            if (map.containsKey(potentialNumber)) {
                return new int[]{potentialNumber, j};
            } else {
                map.put(j, true);
            }
        }
        return new int[]{};
    }

    // O(n) time | O(n) space
    public int[] twoNumberSum5(int[] inputArray, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            int potentialNumber = target - inputArray[i];
            if (map.containsKey(potentialNumber)) {
                return new int[]{map.get(potentialNumber), i};
            } else {
                map.put(inputArray[i], i);
            }
        }
        return new int[]{};
    }
}
