package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Issue26SemordnilapTest {

    @Test
    void semordnilap() {

        String[] words = {"diaper", "abc", "test", "cba", "repaid"};
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList("diaper", "repaid")));
        expected.add(new ArrayList<>(Arrays.asList("abc", "cba")));
        ArrayList<ArrayList<String>> actual = Issue26Semordnilap.semordnilap(words);
        assertEquals(expected, actual);
    }
}