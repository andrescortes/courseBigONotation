package algorithm.algoexpert;

import java.util.HashMap;

public class Issue25FirstNonRepeatingCharacter {

    private Issue25FirstNonRepeatingCharacter() {
    }

    // O(n^2) time | O(1) space - where n is the length of the string
    // This function finds the index of the first non-repeating character in the input string
    // It has a time complexity of O(n) and a space complexity of O(n), where n is the length of the string
    public static int firstNonRepeatingCharacter(String str) {
        for (int idx = 0; idx < str.length(); idx++) {
            boolean foundDuplicate = false;
            for (int idx2 = 0; idx2 < str.length(); idx2++) {
                if (str.charAt(idx) == str.charAt(idx2) && idx != idx2) {
                    foundDuplicate = true;
                }
            }
            if (!foundDuplicate) {
                return idx;
            }
        }
        return -1;
    }

    // O(n) time | O(1) space - where n is the length of the string
    // The constant time is because the input string only has lowercase letters
    // English-alphabet letters; thus, our has table will never have more than 26 characters
    // frequencies
    public static int firstNonRepeatingCharacter2(String str) {
        final HashMap<Character, Integer> characterFrequencies = new HashMap<>();

        for (int idx = 0; idx < str.length(); idx++) {
            char character = str.charAt(idx);
            characterFrequencies.put(character, characterFrequencies.getOrDefault(character, 0) + 1);
        }

        for (int idx = 0; idx < str.length(); idx++) {
            char character = str.charAt(idx);
            if (characterFrequencies.get(character) == 1) {
                return idx;
            }
        }
        return -1;
    }

}
