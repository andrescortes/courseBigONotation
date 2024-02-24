package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Issue21PalindromeCheckTest {

    @Test
    void palindromeCheckSuccess() {
        String input = "racecar";
        assertTrue(Issue21PalindromeCheck.palindromeCheck(input));
    }

    @Test
    void palindromeCheckFail() {
        String input = "racecars";
        assertFalse(Issue21PalindromeCheck.palindromeCheck(input));
    }

    @Test
    void isPalindromeSuccess() {
        String input = "racecar";
        assertTrue(Issue21PalindromeCheck.isPalindrome(input));
    }

    @Test
    void isPalindromeRecursiveSuccess() {
        String input = "racecar";
        assertTrue(Issue21PalindromeCheck.isPalindromeRecursive(input));
    }
}