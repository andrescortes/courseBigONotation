package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue23RunLengthEncodingTest {

    @Test
    void runLengthEncoding() {
        String str = "AAAABBBCCDAA";
        String expected = "4A3B2C1D2A";
        assertEquals(expected, Issue23RunLengthEncoding.runLengthEncoding(str));
    }

    @Test
    void runLengthEncoding2() {
        String str = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB";
        String expected = "9W3W1B9W3W3B9W9W6W1B";
        assertEquals(expected, Issue23RunLengthEncoding.runLengthEncoding(str));
    }

    @Test
    void runLengthEncoding3() {
        String str = "122333";
        String expected = "112233";
        assertEquals(expected, Issue23RunLengthEncoding.runLengthEncoding(str));
    }

    @Test
    void runLengthEncoding4() {
        String str = "*************^^^^^^^$$$$$$$%%%%%%!!!!!!!AAAAAAAAAAAAAAAAAA";
        String expected = "9*4*7^7$6%7!9A9A";
        assertEquals(expected, Issue23RunLengthEncoding.runLengthEncoding(str));
    }

    @Test
    void runLengthEncoding5() {
        String str = "9*4*7^7$6%7!9A9A";
        String expected = "191*141*171^171$161%171!191A191A";
        assertEquals(expected, Issue23RunLengthEncoding.runLengthEncoding(str));
    }
}