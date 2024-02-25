package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue22CaesarCypherEncryptorTest {

    @Test
    void caesarCypherEncryptor1() {
        String str = "xyz";
        int key = 4;
        String expected = "bcd";
        assertEquals(expected, Issue22CaesarCypherEncryptor.caesarCypherEncryptor1(str, key));
    }

    @Test
    void caesarCypherEncryptor2() {
        String str = "xyz";
        int key = 2;
        String expected = "zab";
        assertEquals(expected, Issue22CaesarCypherEncryptor.caesarCypherEncryptor2(str, key));
    }
}