package algorithm.algoexpert;

import algorithm.models.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Issue8NodeDepthsBinaryTreeTest {

    private Issue8NodeDepthsBinaryTree issue8NodeDepthsBinaryTree;

    static Stream<Arguments> generatorTree() {
        BinaryTree binaryTree = new BinaryTree(1);
        binaryTree.setLeft(new BinaryTree(2));
        binaryTree.setRight(new BinaryTree(3));
        binaryTree.getLeft().setLeft(new BinaryTree(4));
        binaryTree.getLeft().setRight(new BinaryTree(5));
        binaryTree.getLeft().getLeft().setLeft(new BinaryTree(8));
        binaryTree.getLeft().getLeft().setRight(new BinaryTree(9));

        binaryTree.getRight().setLeft(new BinaryTree(6));
        binaryTree.getRight().setRight(new BinaryTree(7));
        return Stream.of(
                Arguments.arguments(binaryTree)
        );
    }

    @BeforeEach
    void setUp() {
        issue8NodeDepthsBinaryTree = new Issue8NodeDepthsBinaryTree();
    }

    @ParameterizedTest
    @MethodSource("generatorTree")
    void nodeDepths(BinaryTree root) {
        int depths = issue8NodeDepthsBinaryTree.nodeDepths(root);
        Assertions.assertEquals(16, depths);
    }

    @ParameterizedTest
    @MethodSource("generatorTree")
    void nodeDepthsRecursive(BinaryTree root) {
        int depths = issue8NodeDepthsBinaryTree.nodeDepthsRecursive(root);
        Assertions.assertEquals(16, depths);
    }
}