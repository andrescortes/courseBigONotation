package algorithm.challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue2ValidateSequenceTest {

    private Issue2ValidateSequence validateSequence;
    private int[] inputArray;
    private int[] sequence;

    @BeforeEach
    void setUp() {
        validateSequence = new Issue2ValidateSequence();
        inputArray = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        sequence = new int[]{1, 6, -1, 10};
    }

    @Test
    void validateSequence() {
        boolean result = validateSequence.validateSequence(inputArray, sequence);
        assertTrue(result);
    }

    @Test
    void validateSequence2() {
        boolean result = validateSequence.validateSequence2(inputArray, sequence);
        assertTrue(result);
    }
}