# Big O Notation

## Introduction
Big O notation is used to analyze the efficiency of algorithms and describe how the runtime or space requirements of an algorithm grow as the input size increases. It allows us to compare different algorithms and make informed decisions about which algorithm to use in a given situation.

## Time Complexity
The time complexity of an algorithm measures the amount of time it takes to run as a function of the input size. It is represented using Big O notation. Here are some common time complexities and their corresponding growth rates:

- O(1) - Constant time complexity: The runtime of the algorithm remains constant, regardless of the input size.
- O(log n) - Logarithmic time complexity: The runtime grows logarithmically with the input size.
- O(n) - Linear time complexity: The runtime grows linearly with the input size.
- O(n log n) - Linearithmic time complexity: The runtime grows linearly multiplied by the logarithm of the input size.
- O(n^2) - Quadratic time complexity: The runtime grows quadratically with the input size.
- O(2^n) - Exponential time complexity: The runtime grows exponentially with the input size.

## Space Complexity
The space complexity of an algorithm measures the amount of memory it uses as a function of the input size. It is also represented using Big O notation. Here are some common space complexities:

- O(1) - Constant space complexity: The amount of memory used by the algorithm remains constant, regardless of the input size.
- O(n) - Linear space complexity: The amount of memory used by the algorithm grows linearly with the input size.
- O(n^2) - Quadratic space complexity: The amount of memory used by the algorithm grows quadratically with the input size.

## Examples
Here are some examples to help you understand Big O notation better:

1. Example 1: O(1)
```java
public void printFirstElement(int[] arr) {
    System.out.println(arr[0]);
}
```
Example 2: O(n)
```java
public void printElements(int[] arr) {
    for (int element : arr) {
        System.out.println(element);
    }
}
```
Example 3: O(n^2)
```java
public void printPairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i] + " " + arr[j]);
        }
    }
}
```
