package algorithm.algoexpert;

public class Issue16BinarySearch {

    private Issue16BinarySearch() {

    }

    // O(log(n)) time | O(log(n)) space - where n is the length of the array
    //  [0, 1, 21, 33, 45, 45, 61, 71, 72, 73]
    // target = 33
    // sample output = 3
    public static int binarySearch1(int[] array, int target) {
        return binarySearch1(array, target, 0, array.length - 1);
    }

    private static int binarySearch1(int[] array, int target, int left, int right) {
        if(left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        int potentialMatch = array[middle];
        if(target == potentialMatch) {
            return middle;
        } else if(target < potentialMatch) {
            return binarySearch1(array, target, left, middle - 1);
        } else {
            return binarySearch1(array, target, middle + 1, right);
        }
    }

    // O(log(n)) time | O(1) space - where n is the length of the array
    public static int binarySearch2(int[] array, int target) {
        return binarySearch2(array, target, 0, array.length - 1);
    }

    private static int binarySearch2(int[] array, int target, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            int potentialMatch = array[middle];
            if (target == potentialMatch) {
                return middle;
            } else if (target < potentialMatch) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
