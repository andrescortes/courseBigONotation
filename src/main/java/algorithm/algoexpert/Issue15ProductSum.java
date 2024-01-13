package algorithm.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class Issue15ProductSum {

    private Issue15ProductSum() {

    }

    // O(n) time | O(d) space - where n is the number of elements in the array, and d is the depth of the array
    public static int productSum(List<Object> array) {
        return productSumHelper(array, 1);
    }

    public static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object el : array) {
            if (el instanceof ArrayList) {
                @SuppressWarnings("unchecked")
                ArrayList<Object> lst = (ArrayList<Object>) el;
                sum += productSumHelper(lst, multiplier + 1);
            } else {
                sum += (int) el;
            }
        }
        return sum * multiplier;
    }
}
