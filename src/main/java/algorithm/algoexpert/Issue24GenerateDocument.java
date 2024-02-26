package algorithm.algoexpert;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Issue24GenerateDocument {

    private Issue24GenerateDocument() {
    }

    // O(m * (n + m)) time | O(1) space where n is the length of the characters array and m is the length of the document, m is unique characters in the document
    public static boolean generateDocument(String characters, String document) {
        for (int idx = 0; idx < document.length(); idx++) {
            char character = document.charAt(idx);
            int documentFrequency = countCharacterFrequency(character, document);
            int charactersFrequency = countCharacterFrequency(character, characters);
            if (documentFrequency > charactersFrequency) {
                return false;
            }
        }
        return true;
    }

    public static int countCharacterFrequency(char character, String target) {
        int frequency = 0;
        for (int idx = 0; idx < target.length(); idx++) {
            if (target.charAt(idx) == character) {
                frequency++;
            }
        }
        return frequency;
    }

    // O(c * (n + m)) time | O(c) space where n is the length of the characters array and m is the length of the document, c is unique characters in the document
    public static boolean generateDocument2(String characters, String document) {
        Set<Character> alreadyCounted = new HashSet<>();

        for (int idx = 0; idx < document.length(); idx++) {
            char character = document.charAt(idx);
            if (alreadyCounted.contains(character)) {
                continue;
            }

            int documentFrequency = countCharacterFrequency2(character, document);
            int charactersFrequency = countCharacterFrequency2(character, characters);
            if (documentFrequency > charactersFrequency) {
                return false;
            }
            alreadyCounted.add(character);
        }

        return true;
    }

    // O(n) time | O(1) space where n is the length of the characters array
    public static int countCharacterFrequency2(char character, String target) {
        int frequency = 0;
        for (int idx = 0; idx < target.length(); idx++) {
            char c = target.charAt(idx);
            if (c == character) {
                frequency++;
            }
        }
        return frequency;
    }

    // O(c * (n + m)) time | O(c) space where n is the length of the characters array and m is the length of the document, c is unique characters in the document
    /**
     * This function checks if a document can be generated from a set of characters.
     *
     * @param characters The available characters.
     * @param document   The document to be generated.
     * @return true if the document can be generated, false otherwise.
     */
    public static boolean generateDocument3(String characters, String document) {
        // Create a map to store the count of each character in the available characters.
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        // Count the occurrences of each character in the available characters.
        for (int idx = 0; idx < characters.length(); idx++) {
            char character = characters.charAt(idx);
            characterCounts.put(character, characterCounts.getOrDefault(character, 0) + 1);
        }

        // Check if the document can be generated from the available characters.
        for (int idx = 0; idx < document.length(); idx++) {
            char character = document.charAt(idx);
            // If the character is not in the available characters or its count is 0, return false.
            if (!characterCounts.containsKey(character) || characterCounts.get(character) == 0) {
                return false;
            }
            // Decrement the count of the character in the available characters.
            characterCounts.put(character, characterCounts.get(character) - 1);
        }

        // If all characters in the document can be generated, return true.
        return true;
    }
}
