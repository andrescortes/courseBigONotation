package algorithm.challenges;

import java.util.Arrays;

public class Issue12TandemBicycle {

    private Issue12TandemBicycle() {

    }

    // redShirtSpeeds [5, 5, 3, 9, 2]
    // blueShirtSpeeds [3, 6, 7, 2, 1]
    // fastest true
    // return 32
    // Time O(n log n) | Space O(1) - where n is the length of the array (both arrays are sorted)
    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        if (!fastest) {
            reverseArrayInPlace(redShirtSpeeds);
        }
        int totalSpeed = 0;
        for (int idx = 0; idx < redShirtSpeeds.length; idx++) {
            int rider1 = redShirtSpeeds[idx];
            int rider2 = blueShirtSpeeds[blueShirtSpeeds.length - 1 - idx];
            totalSpeed += Math.max(rider1, rider2);
        }
        return totalSpeed;
    }

    private static void reverseArrayInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
