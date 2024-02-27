package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue29MoveElementToEndTest {

    @Test
    void moveElementToEnd() {
        List<Integer> array = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
        List<Integer> result = Issue29MoveElementToEnd
                .moveElementToEnd(array, 2);
        assertEquals(Arrays.asList(4, 1, 3, 2, 2, 2, 2, 2), result);
    }
}