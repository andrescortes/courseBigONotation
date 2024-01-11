package algorithm.algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Issue10MinimunWaitingTimeTest {

    private int[] queries;
    private int[] queries2;

    @BeforeEach
    void setUp() {
        queries = new int[]{3, 2, 1, 2, 6};
        queries2 = new int[]{2, 1, 1, 1};
    }


    @Test
    void minimumWaitingTimeSolution() {
        Assertions.assertEquals(17, Issue10MinimunWaitingTime.minimumWaitingTimeSolution(queries));
    }

    @Test
    void minimumWaitingTimeNewInput() {
        int[] queries = new int[]{2, 1, 1, 1};
        int expected = 6;
        Assertions.assertEquals(expected, Issue10MinimunWaitingTime.minimumWaitingTimeSolution(queries));
    }

    @Test
    void minimumWaitingTimeWithOneTimeSpending() {
        int[] queries = new int[]{100};
        int expected = 0;
        Assertions.assertEquals(expected, Issue10MinimunWaitingTime.minimumWaitingTimeSolution(queries));
    }
    @Test
    void minimumWaitingTimeWithTwoTimeSpending() {
        int[] queries = new int[]{100,1};
        Arrays.sort(queries);
        int expected = queries[0];//'1' It happens cuz the array is sorted, so the first element is the minimum
        Assertions.assertEquals(expected, Issue10MinimunWaitingTime.minimumWaitingTimeSolution(queries));
    }
}