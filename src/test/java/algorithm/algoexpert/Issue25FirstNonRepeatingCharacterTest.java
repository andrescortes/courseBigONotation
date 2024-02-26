package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue25FirstNonRepeatingCharacterTest {

    @Test
    void firstNonRepeatingCharacter() {
        String string = "abcdcaf";
        int expected = 1;
        int actual = Issue25FirstNonRepeatingCharacter.firstNonRepeatingCharacter(string);
        assertEquals(expected, actual);
    }

    @Test
    void firstNonRepeatingCharacter2() {
        String string = "faadabcbbebdf";
        int expected = 6;
        int actual = Issue25FirstNonRepeatingCharacter.firstNonRepeatingCharacter(string);
        assertEquals(expected, actual);
    }

    @Test
    void firstNonRepeatingCharacter3() {
        String string = "faadabcbbebdf";
        int expected = 6;
        int actual = Issue25FirstNonRepeatingCharacter.firstNonRepeatingCharacter2(string);
        assertEquals(expected, actual);
    }
}