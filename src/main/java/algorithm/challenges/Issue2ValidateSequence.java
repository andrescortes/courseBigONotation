package algorithm.challenges;

import java.util.Objects;

public class Issue2ValidateSequence {

    // O(n) time | O(1) space - where n is the length of the array and m is the length of the sequence
    public boolean validateSequence(int[] array, int[] sequence) {
        int pointerArray = 0;
        int pointerSequence = 0;

        while (pointerArray < array.length && pointerSequence < sequence.length) {
            if (Objects.equals(array[pointerArray], sequence[pointerSequence])) {
                pointerSequence++;
            }
            pointerArray++;
            if (pointerSequence == sequence.length) {
                return true;
            }
        }
        return false;
    }

    // O(n) time | O(1) space - where n is the length of the array and m is the length of the sequence
    public boolean validateSequence2(int[] array, int[] sequence) {
        int pointerArray = 0;
        for (Integer integer : array) {
            if (pointerArray == sequence.length) {
                break;
            }
            if (integer.equals(sequence[pointerArray])) {
                pointerArray++;
            }
            if (pointerArray == sequence.length) {
                return true;
            }
        }
        return false;
    }
}
