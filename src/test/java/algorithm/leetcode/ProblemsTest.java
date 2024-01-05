package algorithm.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;


class ProblemsTest {
    private Problems problems;
    private String word1;
    private String word2;

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                arguments("ABCABC", "ABC"),
                arguments("ABABAB", "ABAB")
        );
    }

    @BeforeEach
    void setUp() {
        problems = new Problems();
        word1 = "hlo";
        word2 = "el";
    }

    @Test
    void mergeAlternately() {
        String expected = "hello";
        String result = problems.mergeAlternately(word1, word2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void mergeAlternatelyOptimized() {
        String expected = "hello";
        String result = problems.mergeAlternatelyOptimized(word1, word2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void gcdOfStrings_1(String str1, String str2) {
        String result = problems.gcdOfStrings(str1, str2);
        Assertions.assertEquals(str2, result);
    }

    @Test
    void gcdOfStrings_2() {
        String str1 = "LEET";
        String str2 = "CODE";
        String result = problems.gcdOfStrings(str1, str2);
        Assertions.assertNull(result);
    }
}