package algorithm.algoexpert;

public class Issue22CaesarCypherEncryptor {

    private Issue22CaesarCypherEncryptor() {
    }

    // O(n) time | O(n) space
    // where n is the length of the string
    public static String caesarCypherEncryptor1(String str, int key) {
        char[] newLetters = new char[str.length()];
        int newKey = key % 26;

        for (int i = 0; i < str.length(); i++) {
            newLetters[i] = getNewLetter(str.charAt(i), newKey);
        }
        return new String(newLetters);
    }

    public static char getNewLetter(char letter, int key) {
        int newLetterCode = letter + key;
        return newLetterCode <= 122 ? (char) newLetterCode : (char) (96 + newLetterCode % 122);
    }

    // O(n) time | O(n) space
    // where n is the length of the string
    public static String caesarCypherEncryptor2(String str, int key) {
        char[] newLetters = new char[str.length()];
        int newKey = key % 26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {
            newLetters[i] = getNewLetter(str.charAt(i), newKey, alphabet);
        }
        return new String(newLetters);
    }

    public static char getNewLetter(char letter, int key, String alphabet) {
        int newLetterCode = alphabet.indexOf(letter) + key;
        return alphabet.charAt(newLetterCode % 26);
    }
}
