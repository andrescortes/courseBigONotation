package algorithm.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Issue26Semordnilap {

    private Issue26Semordnilap() {
    }

    // O(n * m) time | O(n * m) space - where n is the number of words and
    // m is the length of the longest word
    public static ArrayList<ArrayList<String>> semordnilap(String[] words) {
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        ArrayList<ArrayList<String>> semordnilapPairs = new ArrayList<>();
        for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();
            if (wordSet.contains(reverse) && !word.equals(reverse)) {
                ArrayList<String> semordnilapPair = new ArrayList<>();
                semordnilapPair.add(word);
                semordnilapPair.add(reverse);
                semordnilapPairs.add(semordnilapPair);
                wordSet.remove(word);
                wordSet.remove(reverse);
            }
        }
        return semordnilapPairs;
    }
}
