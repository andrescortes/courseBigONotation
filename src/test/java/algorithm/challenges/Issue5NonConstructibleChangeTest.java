package algorithm.challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue5NonConstructibleChangeTest {

    private Issue5NonConstructibleChange nonConstructibleChange;
    private final int[] COINS = {5, 7, 1, 1, 2, 3, 22};

    @BeforeEach
    void setUp() {
        nonConstructibleChange = new Issue5NonConstructibleChange();
    }

    @Test
    void nonConstructibleChange() {
        int change = nonConstructibleChange.nonConstructibleChange(COINS);
        assertEquals(20, change);
    }
}