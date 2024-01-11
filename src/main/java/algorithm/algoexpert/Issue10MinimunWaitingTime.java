package algorithm.algoexpert;

import java.util.Arrays;

public class Issue10MinimunWaitingTime {

    private Issue10MinimunWaitingTime() {

    }

    // [3,2,1,2,6] minimum waiting time = 17
    // [1,2,2,3,6] the array must be sorted in order to calculate the total waiting time
    //     1       2       2       3       6
    //     0      0+1    0+1+2  0+1+2+2  0+1+2+2+3
    //     0       1       3       5       8
    // 0 + 1 + 3 + 5 + 8 = 17

    // O(n log n) time | O(1) space - where n is the number of queries
    public static int minimumWaitingTimeSolution(int[] queries) {
        Arrays.sort(queries);
        int totalWaitingTime = 0;
        for (int idx = 0; idx < queries.length; idx++) {
            int duration = queries[idx];
            int queriesLeft = queries.length - (idx + 1);
            totalWaitingTime += duration * queriesLeft;
        }
        return totalWaitingTime;
    }
}
