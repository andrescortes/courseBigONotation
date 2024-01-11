package algorithm.leetcode;

import java.util.Arrays;

public class Problems {

    public String mergeAlternately(String word1, String word2) {
        String[] words1 = word1.split("");
        String[] words2 = word2.split("");
        StringBuilder result = new StringBuilder();
        int w1Length = 0;
        int w2Length = 0;
        while (w1Length < word1.length() && w2Length < words2.length) {
            result.append(words1[w1Length]);
            result.append(words2[w1Length]);
            w1Length++;
            w2Length++;
        }
        String[] aux;
        if (words1.length < words2.length) {
            aux = Arrays.copyOfRange(words2, words1.length, words2.length);
        } else {
            aux = Arrays.copyOfRange(words1, words2.length, words1.length);
        }
        return result.toString().concat(String.join("", aux));
    }

    //O(n) time O(n) space
    public String mergeAlternatelyOptimized(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

//    Example 1:
//
//    Input: str1 = "ABCABC", str2 = "ABC"
//    Output: "ABC"

    public String gcdOfStrings(String str1, String str2) {
        int sequence = 0;
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();
        int i = 0;
        StringBuilder builder = new StringBuilder();
        while (i < str2.length()) {
            if (str1CharArray[i] == str2CharArray[i]) {
                sequence++;
                builder.append(str2CharArray[i]);
            }
            if (sequence == str2.length()) {
                return builder.toString();
            }
            i++;
        }
        return null;
    }

    public String reverseString(String input) {
        // Define the base-case / stopping condition
        if (input.isEmpty()) {
            return input;
        }
        // Do some work to shrink the problem space
        return reverseString(input.substring(1)) + input.charAt(0);
    }

    public boolean isPalindrome(String input) {
        // Define the base-case / stopping condition
        if (input.isEmpty() || input.length() == 1) {
            return true;
        }
        //Do some work to shrink the problem space
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }
        // Additional base-case to handle non-palindromes
        return false;
    }

    public String findBinary(int decimal, String result) {
        // Define the base-case / stopping condition
        if (decimal == 0) {
            return result;
        }
        // Variable to store the remainder
        result = (decimal % 2) + result;
        //Do some work to shrink the problem space
        return findBinary(decimal / 2, result);
    }

    public int recursiveSummation(int inputNumber) {
        if (inputNumber <= 1) {
            return inputNumber;
        }
        return inputNumber + recursiveSummation(inputNumber - 1);
    }

    public int binarySearch(int[] array, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (array[mid] == target) {
            return mid;
        }
        if (target < array[mid]) {
            return binarySearch(array, left, mid - 1, target);
        }
        return binarySearch(array, mid + 1, right, target);
    }
}
