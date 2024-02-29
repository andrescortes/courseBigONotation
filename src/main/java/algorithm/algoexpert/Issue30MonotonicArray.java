package algorithm.algoexpert;

public class Issue30MonotonicArray {

    private Issue30MonotonicArray() {
    }

    // O(n) time | O(1) space - where n is the length of the input array
    public static boolean isMonotonic(int[] array) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isIncreasing = false;
            }
            if (array[i] > array[i - 1]) {
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }

    // O(n) time | O(1) space - where n is the length of the input array
    public static boolean isMonotonic2(int[] array) {
        if (array.length < 2) return true;

        var direction = array[1] - array[0];
        for (int i = 2; i < array.length; i++) {
            if (direction == 0) {
                direction = array[i] - array[i - 1];
                continue;
            }
            if (breaksDirection(direction, array[i - 1], array[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean breaksDirection(int direction, int previous, int current) {
        var difference = current - previous;
        if (direction > 0) return difference < 0;
        return difference > 0;
    }
}
