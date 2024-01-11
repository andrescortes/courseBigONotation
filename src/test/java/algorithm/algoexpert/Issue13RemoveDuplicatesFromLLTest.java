package algorithm.algoexpert;

import algorithm.models.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue13RemoveDuplicatesFromLLTest {

    @Test
    void removeDuplicatesFromLinkedList() {

        // linkedList = 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5 // the head node with value 1
        // sample output: 1 -> 2 -> 3 -> 4 -> 5
        LinkedList linkedList = new LinkedList(1);
        linkedList.setNext(new LinkedList(2));
        linkedList.getNext().setNext(new LinkedList(3));
        linkedList.getNext().getNext().setNext(new LinkedList(3));
        linkedList.getNext().getNext().getNext().setNext(new LinkedList(4));
        linkedList.getNext().getNext().getNext().getNext().setNext(new LinkedList(4));
        linkedList.getNext().getNext().getNext().getNext().getNext().setNext(new LinkedList(5));

        LinkedList result = Issue13RemoveDuplicatesFromLL.removeDuplicatesFromLinkedList(linkedList);
        assertEquals(1, result.getValue());
        assertEquals(2, result.getNext().getValue());
        assertEquals(3, result.getNext().getNext().getValue());
        assertEquals(4, result.getNext().getNext().getNext().getValue());
        assertEquals(5, result.getNext().getNext().getNext().getNext().getValue());
    }
}