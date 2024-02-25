package algorithm.algoexpert;

public class Issue23RunLengthEncoding {

    public Issue23RunLengthEncoding() {
    }

    // O(n) time | O(n) space where n is the length of the string
    // This function takes in a string and performs run-length encoding on it.
    // It iterates through the input string and counts the consecutive occurrences of each character.
    // It then encodes the consecutive occurrences and the character itself into the result string.
    // The time complexity is O(n) where n is the length of the string, and the space complexity is O(n) as well.
    public static String runLengthEncoding(String str) {
        StringBuilder encodedStringCharacters = new StringBuilder();
        int currentRunLength = 1;

        for (int i = 1; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            char previousCharacter = str.charAt(i - 1);

            if (currentCharacter != previousCharacter || currentRunLength == 9) {
                // Append the run length and character to the result string
                encodedStringCharacters.append(currentRunLength);
                encodedStringCharacters.append(previousCharacter);
                currentRunLength = 0;
            }
            currentRunLength++;
        }

        // Append the final run length and character to the result string
        encodedStringCharacters.append(currentRunLength);
        encodedStringCharacters.append(str.charAt(str.length() - 1));

        // Return the encoded string
        return encodedStringCharacters.toString();
    }
}
