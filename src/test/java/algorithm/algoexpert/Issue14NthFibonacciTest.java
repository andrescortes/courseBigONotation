package algorithm.algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Issue14NthFibonacciTest {

    @Test
    void nthFibonacci() {
        int resultExpected = 8;
        int result = Issue14NthFibonacci.nthFibonacci(7);
        Assertions.assertEquals(resultExpected, result);
    }

    @Test
    void getNthFib() {
        int resultExpected = 8;
        int result = Issue14NthFibonacci.getNthFib(7);
        Assertions.assertEquals(resultExpected, result);
    }

    @Test
    void getNthFibMemoization() {
        int resultExpected = 8;
        int result = Issue14NthFibonacci.getNthFibMemoization(7);
        Assertions.assertEquals(resultExpected, result);
    }
}