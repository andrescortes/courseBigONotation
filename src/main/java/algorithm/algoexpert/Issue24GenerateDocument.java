package algorithm.algoexpert;

public class Issue24GenerateDocument {

    public Issue24GenerateDocument() {
    }

    // O(n) time | O(n) space
    // where n is the length of the characters array
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
}
