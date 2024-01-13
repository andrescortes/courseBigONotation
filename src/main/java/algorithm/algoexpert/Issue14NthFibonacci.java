package algorithm.algoexpert;

import java.util.HashMap;
import java.util.Map;

public class Issue14NthFibonacci {

    private Issue14NthFibonacci() {

    }

    // O(2^n) time | O(n) space
    // Brute force
    public static int nthFibonacci(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            return nthFibonacci(n - 1) + nthFibonacci(n - 2);
        }
    }

    // O(n) time | O(1) space
    // Best solution
    public static int getNthFib(int n) {
        int[] lastTwo = {0, 1};
        int counter = 3;
        while (counter <= n) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return n > 1 ? lastTwo[1] : lastTwo[0];
    }

    // O(n) time | O(n) space
    public static int getNthFibMemoization(int n) {
        Map<Integer, Integer> memoize = new HashMap<>();
        memoize.put(1, 0);
        memoize.put(2, 1);
        return getNthFibMemoization(n, memoize);
    }

    private static int getNthFibMemoization(int n, Map<Integer, Integer> memoize) {
        if (memoize.containsKey(n)) {
            return memoize.get(n);
        } else {
            memoize.put(n, getNthFibMemoization(n - 1, memoize) + getNthFibMemoization(n - 2, memoize));
            return memoize.get(n);
        }
    }

}
