package algorithm.algoexpert;

import algorithm.models.LinkedList;

public class Issue13RemoveDuplicatesFromLL {

    private Issue13RemoveDuplicatesFromLL() {

    }

    // linkedList = 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5 // the head node with value 1
    // sample output: 1 -> 2 -> 3 -> 4 -> 5
    // O(n) time | O(1) space - where n is the number of nodes in the LinkedList
    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList currentNode = linkedList;
        while (currentNode != null) {
            LinkedList nextDistinctNode = currentNode.getNext();
            while (nextDistinctNode != null && currentNode.getValue() == nextDistinctNode.getValue()) {
                nextDistinctNode = nextDistinctNode.getNext();
            }
            currentNode.setNext(nextDistinctNode);
            currentNode = nextDistinctNode;
        }
        return linkedList;
    }
}
