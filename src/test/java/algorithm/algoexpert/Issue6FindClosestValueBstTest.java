package algorithm.algoexpert;

import algorithm.models.BST;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue6FindClosestValueBstTest {

    private Issue6FindClosestValueBst issue6FindClosestValueBst;
    private BST tree;

    @BeforeEach
    void setUp() {
        issue6FindClosestValueBst = new Issue6FindClosestValueBst();
        //                     10
        //                   /    \
        //                  5      15
        //                /   \   /   \
        //               2    5  13   22
        //              /          \
        //             1            14
        tree = new BST(10);
        tree.setLeft(new BST(5));
        tree.getLeft().setLeft(new BST(2));
        tree.getLeft().setRight(new BST(5));
        tree.getLeft().getLeft().setLeft(new BST(1));
        tree.setRight(new BST(15));
        tree.getRight().setRight(new BST(22));
        tree.getRight().setLeft(new BST(13));
        tree.getRight().getLeft().setRight(new BST(14));
    }

    @Test
    void findClosestValueInBstIterative() {
        int bstIterative = issue6FindClosestValueBst.findClosestValueInBstIterative(tree, 12);
        assertEquals(13, bstIterative);
    }

    @Test
    void findClosestValueInBst() {
        int bst = issue6FindClosestValueBst.findClosestValueInBst(tree, 16);
        assertEquals(15, bst);
    }
}