package algorithm.algoexpert;

import algorithm.models.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Issue7BranchSumBinaryTree {

    // worst O(n) time | O(n) space - where n is the number of nodes in the tree
    public List<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> sums = new ArrayList<>();
        calculateBranchSums(root, 0, sums);
        return sums;
    }

    private void calculateBranchSums(BinaryTree root, int runningSum, List<Integer> sums) {
        if (root == null) {
            return;
        }
        int newRunningSum = runningSum + root.getValue();
        if (root.getLeft() == null && root.getRight() == null) {
            sums.add(newRunningSum);
            return;
        }
        calculateBranchSums(root.getLeft(), newRunningSum, sums);
        calculateBranchSums(root.getRight(), newRunningSum, sums);
    }
}
