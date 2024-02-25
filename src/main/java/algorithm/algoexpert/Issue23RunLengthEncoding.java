package algorithm.algoexpert;

public class Issue23RunLengthEncoding {

    public Issue23RunLengthEncoding() {
    }

    // O(n) time | O(n) space
    // where n is the length of the string
    public static String runLengthEncoding(String str) {
        StringBuilder encodedStringCharacters = new StringBuilder();
        int currentRunLength = 1;
        for (int i = 1; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            char previousCharacter = str.charAt(i - 1);
            if (currentCharacter != previousCharacter || currentRunLength == 9) {
                encodedStringCharacters.append(currentRunLength);
                encodedStringCharacters.append(previousCharacter);
                currentRunLength = 0;
            }
            currentRunLength++;
        }
        encodedStringCharacters.append(currentRunLength);
        encodedStringCharacters.append(str.charAt(str.length() - 1));
        return encodedStringCharacters.toString();
    }
}
