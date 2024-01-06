package algorithm.challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue9DepthFirstSearchBinaryTreeTest {
    private Issue9DepthFirstSearchBinaryTree.Node root;

    @BeforeEach
    void setUp() {
        //          A
        //       /  |  \
        //      B   C   D
        //     / \     / \
        //    E   F   G   H
        //       / \   \
        //      I   J   K
        // [A, B, E, F, I, J, C, D, G, K, H]
        root = new Issue9DepthFirstSearchBinaryTree.Node("A");
        root.addChild("B").addChild("C").addChild("D");
        root.children.get(0).addChild("E").addChild("F");
        root.children.get(2).addChild("G").addChild("H");
        root.children.get(0).children.get(1).addChild("I").addChild("J");
        root.children.get(2).children.get(0).addChild("K");

    }

    @Test
    void depthFirstSearch() {
        List<String> arrayExpected = List.of("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H");
        List<String> result = root.depthFirstSearch(new ArrayList<>());
        assertEquals(arrayExpected, result);
    }
}