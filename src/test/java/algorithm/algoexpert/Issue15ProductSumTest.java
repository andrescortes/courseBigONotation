package algorithm.algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Issue15ProductSumTest {

    @Test
    void productSum() {
        // array = [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
        List<Object> array = new ArrayList<>();
        array.add(5);
        array.add(2);
        List<Object> innerList = new ArrayList<>();
        innerList.add(7);
        innerList.add(-1);
        array.add(innerList);
        array.add(3);
        List<Object> innerList2 = new ArrayList<>();
        innerList2.add(6);
        List<Object> innerList3 = new ArrayList<>();
        innerList3.add(-13);
        innerList3.add(8);
        innerList2.add(innerList3);
        innerList2.add(4);
        array.add(innerList2);

        Assertions.assertEquals(12, Issue15ProductSum.productSum(array));
    }
}