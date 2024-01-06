package algorithm.challenges;

import algorithm.models.BinaryTree;
import algorithm.models.LevelNode;

import java.util.ArrayList;
import java.util.List;

public class Issue8NodeDepthsBinaryTree {

    //Average case: when the three is balanced
    // O(n) time | O(h) space - where n is the number of nodes in
    //the Binary Tree and h is the height of the Binary Tree
    public int nodeDepths(BinaryTree root) {
        int sumOfDepths = 0;
        List<LevelNode> stack = new ArrayList<>();
        stack.add(new LevelNode(root, 0));
        while (!stack.isEmpty()) {
            LevelNode top = stack.remove(stack.size() - 1);
            BinaryTree node = top.getRoot();
            int depth = top.getDepth();
            if (node == null) continue;
            sumOfDepths += depth;
            stack.add(new LevelNode(node.getLeft(), depth + 1));
            stack.add(new LevelNode(node.getRight(), depth + 1));
        }
        return sumOfDepths;
    }

    //O(n) time, O(h) h is height of the binary tree
    public int nodeDepthsRecursive(BinaryTree root) {
        return nodeDepthsHelper(root, 0);
    }

    private int nodeDepthsHelper(BinaryTree root, int depth) {
        if (root == null) return 0;
        return depth + nodeDepthsHelper(root.getLeft(), depth + 1) + nodeDepthsHelper(root.getRight(), depth + 1);
    }
}
