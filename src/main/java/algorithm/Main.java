package algorithm;

import algorithm.challenges.Issue7BranchSumBinaryTree;
import algorithm.models.BinaryTree;

import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
//        Issue4TournamentWinner issue4TournamentWinner = new Issue4TournamentWinner();
//
//        String[] competitions = {
//                "HTML,C#",
//                "C#,Python",
//                "Python,HTML"
//        };
//        int[] results = {0,0,1};
//        String winner = issue4TournamentWinner.tournamentWinner(competitions,results);
//        String formatted = String.format("winner: %s", winner);
//        LOGGER.info(formatted);

//        Issue5NonConstructibleChange issue5NonConstructibleChange = new Issue5NonConstructibleChange();
//        int[] coins = {5, 7, 1, 1, 2, 3, 22};
//        int[] coins2 = {1,1};
//        int[] coins4 = {1,2,5};
//        int[] coins3 = {5,6,1,1,2,3,43};
//        int nonConstructibleChange = issue5NonConstructibleChange.nonConstructibleChange(coins);
//        String formatted = String.format("nonConstructibleChange: %s", nonConstructibleChange);
//        LOGGER.info(formatted);

//        Issue6FindClosestValueBST issue6FindClosestValueBST = new Issue6FindClosestValueBST();
//        //                     10
//        //                   /    \
//        //                  5      15
//        //                /   \   /   \
//        //               2    5  13   22
//        //              /          \
//        //             1            14
//        BST tree = new BST(10);
//
//        tree.setLeft(new BST(5));
//        tree.getLeft().setLeft(new BST(2));
//        tree.getLeft().setRight(new BST(5));
//        tree.getLeft().getLeft().setLeft(new BST(1));
//
//        tree.setRight(new BST(15));
//        tree.getRight().setRight(new BST(22));
//        tree.getRight().setLeft(new BST(13));
//        tree.getRight().getLeft().setRight(new BST(14));
//
//        int target = 12;
//        int closest = issue6FindClosestValueBST.findClosestValueInBstIterative(tree, target);
//        String formatted = String.format("closest: %s", closest);
//        LOGGER.info(formatted);

        Issue7BranchSumBinaryTree issue7BranchSumBinaryTree = new Issue7BranchSumBinaryTree();

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

//        BinaryTree tree = new BinaryTree(1);
//        tree.setLeft(new BinaryTree(2));
//        tree.setRight(new BinaryTree(3));
//        tree.getLeft().setLeft(new BinaryTree(4));
//        tree.getLeft().setRight(new BinaryTree(5));
//        tree.getLeft().getLeft().setLeft(new BinaryTree(8));
//        tree.getLeft().getLeft().setRight(new BinaryTree(9));
//        tree.getLeft().getRight().setLeft(new BinaryTree(10));
//
//        tree.getRight().setLeft(new BinaryTree(6));
//        tree.getRight().setRight(new BinaryTree(7));
//
//        List<Integer> sums = issue7BranchSumBinaryTree.branchSums(tree);
//        String formatted = String.format("sums: %s", sums);
//        LOGGER.info(formatted);

    }
}