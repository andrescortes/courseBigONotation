package algorithm.challenges;

import java.util.Arrays;

public class Issue5NonConstructibleChange {

    // O(n log(n)) time because of sorting | O(1) space
    /*
     This code snippet calculates the smallest amount of change that cannot be created
     using a given set of coins. It sorts the coins in ascending order and iterates through them.
     If a coin is greater than the current amount of change created plus one, it means that change cannot be created,
     so it returns the current amount of change plus one. Otherwise, it adds the current coin to the amount of change created.
     Finally, it returns the current amount of change plus one. The time complexity is O(n log(n)) and the space complexity is O(1).
     */
    public int nonConstructibleChange(int[] coins) {
        int currentChangeCreated = 0;//
        Arrays.sort(coins);
        for (int currentCoin : coins) {
            if (currentCoin > currentChangeCreated + 1) {
                return currentChangeCreated + 1;
            }
            currentChangeCreated += currentCoin;
        }
        return currentChangeCreated + 1;
    }
}
