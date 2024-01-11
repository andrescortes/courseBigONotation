package algorithm.algoexpert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue12TandemBicycleTest {

    private int[] redShirtSpeeds;
    private int[] blueShirtSpeeds;

    @BeforeEach
    void setUp() {
        // redShirtSpeeds [5, 5, 3, 9, 2]
        // blueShirtSpeeds [3, 6, 7, 2, 1]
        // fastest true
        // return 32
        redShirtSpeeds = new int[]{5, 5, 3, 9, 2};
        blueShirtSpeeds = new int[]{3, 6, 7, 2, 1};
    }

    @Test
    void tandemBicycleIsFastest() {
        int resultExpected = 32;
        int result = Issue12TandemBicycle.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true);
        assertEquals(resultExpected, result);
    }

    @Test
    void tandemBicycleIsNotFastest() {
        int resultExpected = 25;
        int result = Issue12TandemBicycle.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false);
        assertEquals(resultExpected, result);
    }
}