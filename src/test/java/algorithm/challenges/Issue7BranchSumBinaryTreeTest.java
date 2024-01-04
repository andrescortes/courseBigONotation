package algorithm.challenges;

import algorithm.models.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Issue7BranchSumBinaryTreeTest {

    private Issue7BranchSumBinaryTree branchSumBinaryTree;
    private BinaryTree binaryTree;
    private List<Integer> sumsExpected;

    @BeforeEach
    void setUp() {
        branchSumBinaryTree = new Issue7BranchSumBinaryTree();
        //                     1
        //                   /    \
        //                  2       3
        //                /   \    /   \
        //               4     5  6     7
        //              / \   /
        //             8   9 10
        // [15,16,18,10,11]
        // 15 == 1 + 2 + 4 + 8
        // 16 == 1 + 2 + 4 + 9
        // 18 == 1 + 2 + 4 + 10
        // 10 == 1 + 2 + 5
        // 11 == 1 + 3 + 7
        sumsExpected = List.of(15, 16, 18, 10, 11);
        binaryTree = new BinaryTree(1);
        binaryTree.setLeft(new BinaryTree(2));
        binaryTree.setRight(new BinaryTree(3));
        binaryTree.getLeft().setLeft(new BinaryTree(4));
        binaryTree.getLeft().setRight(new BinaryTree(5));
        binaryTree.getLeft().getLeft().setLeft(new BinaryTree(8));
        binaryTree.getLeft().getLeft().setRight(new BinaryTree(9));
        binaryTree.getLeft().getRight().setLeft(new BinaryTree(10));

        binaryTree.getRight().setLeft(new BinaryTree(6));
        binaryTree.getRight().setRight(new BinaryTree(7));
    }

    @Test
    void branchSums() {
        List<Integer> sums = branchSumBinaryTree.branchSums(binaryTree);
        assertEquals(sumsExpected, sums);
    }
}