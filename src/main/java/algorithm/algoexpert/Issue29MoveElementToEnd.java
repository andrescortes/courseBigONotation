package algorithm.algoexpert;

import java.util.List;

public class Issue29MoveElementToEnd {

    private Issue29MoveElementToEnd() {
    }

    // Time O(n) | Space O(1)
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;

        while (i < j) {
            while (i < j && array.get(j) == toMove) {
                j--;
            }
            if (array.get(i) == toMove) {
                swap(array, i, j);
            }
            i++;
        }
        return array;
    }

    public static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}
