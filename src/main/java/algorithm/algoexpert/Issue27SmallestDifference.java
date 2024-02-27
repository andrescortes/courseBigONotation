package algorithm.algoexpert;

import java.util.Arrays;

public class Issue27SmallestDifference {

    private Issue27SmallestDifference() {
    }

    // O(n log(n) + m log(m)) time | O(1) space - where n is the length of the
    // first array and m is the length of the second array
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne = 0;
        int idxTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];
            if (firstNum < secondNum) {
                current = secondNum - firstNum;
                idxOne++;
            } else if (secondNum < firstNum) {
                current = firstNum - secondNum;
                idxTwo++;
            } else {
                return new int[]{firstNum, secondNum};
            }
            if (smallest > current) {
                smallest = current;
                smallestPair = new int[]{firstNum, secondNum};
            }
        }
        return smallestPair;
    }
}
