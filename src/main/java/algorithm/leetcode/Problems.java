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
}
