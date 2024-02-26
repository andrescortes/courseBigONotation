package algorithm.algoexpert;

public class Issue21PalindromeCheck {

    private Issue21PalindromeCheck() {
    }

    // Best: O(n) time | O(n) space
    // Average: O(n) time | O(n) space
    // Worst: O(n) time | O(n) space
    // input str = "racecar"
    // output = true
    public static boolean palindromeCheck(String str) {
        if (str == null || str.length() < 2) {
            return true;
        }
        int startIdx = 0;
        int endIdx = str.length() - 1;
        while (startIdx < endIdx) {
            if (str.charAt(startIdx) != str.charAt(endIdx)) {
                return false;
            }
            startIdx++;
            endIdx--;
        }
        return true;
    }

    // Best: O(n) time | O(1) space
    // Average: O(n) time | O(1) space
    // Worst: O(n) time | O(1) space
    // input array = "racecar"
    // output = true
    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return str.contentEquals(reversed);
    }

    // Best: O(n) time | O(1) space
    // Average: O(n) time | O(1) space
    // Worst: O(n) time | O(1) space
    // input array = "racecar"
    // output = true
    public static boolean isPalindromeRecursive(String str) {
        return isPalindromeRecursive(str, 0);
    }

    public static boolean isPalindromeRecursive(String str, int index) {
        int j = str.length() - 1 - index;
        return index >= j || str.charAt(index) == str.charAt(j) && isPalindromeRecursive(str, index + 1);
    }
}
