package algorithm.algoexpert;

import algorithm.models.BST;

import java.util.Objects;

public class Issue6FindClosestValueBst {

    // average O(log(n)) time | O(1) space - where n is the number of nodes in the tree
    // worst O(n) time | O(1) space - where n is the number of nodes in the tree
    public int findClosestValueInBstIterative(BST tree, int target) {
        return findClosestValueInBstIterative(tree, target, tree.getValue());
    }

    /**
     * Finds the closest value to the target in a binary search tree in an iterative manner.
     *
     * @param  tree    the binary search tree to search in
     * @param  target  the target value
     * @param  closest the initial closest value
     * @return         the closest value to the target in the binary search tree
     */
    private int findClosestValueInBstIterative(BST tree, int target, int closest) {
        BST currentNode = tree;
        while (Objects.nonNull(currentNode)) {
            if (Math.abs(target - closest) > Math.abs(target - currentNode.getValue())) {
                closest = currentNode.getValue();
            }
            if (target < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
            } else if (target > currentNode.getValue()) {
                currentNode = currentNode.getRight();
            } else {
                break;
            }
        }
        return closest;
    }

    // average O(log(n)) time | O(log(n)) space - where n is the number of nodes in the tree
    // worst O(n) time | O(n) space - where n is the number of nodes in the tree
    public int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree, target, tree.getValue());
    }

    /**
     * Finds the closest value in a binary search tree (BST) to a given target value.
     *
     * @param  tree    the root of the BST
     * @param  target  the target value
     * @param  closest the current closest value to the target
     * @return         the closest value in the BST to the target
     */
    private int findClosestValueInBst(BST tree, int target, int closest) {
        if (Math.abs(target - closest) > Math.abs(target - tree.getValue())) {
            closest = tree.getValue();
        }
        if (target < tree.getValue() && tree.getLeft() != null) {
            return findClosestValueInBst(tree.getLeft(), target, closest);
        } else if (target > tree.getValue() && tree.getRight() != null) {
            return findClosestValueInBst(tree.getRight(), target, closest);
        }
        return closest;
    }
}
