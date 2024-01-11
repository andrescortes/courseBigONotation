package algorithm.algoexpert;

import java.util.HashMap;
import java.util.Map;

public class Issue4TournamentWinner {
    private static final int HOME_TEAM_WON = 1;

    // O(n) time | O(k + 1) space - where n is the number of competitions and k is the number of teams
    public String tournamentWinner(String[] competitions, int[] results) {
        String currentBestTeam = "";
        String winningTeam;
        Map<String, Integer> scores = new HashMap<>();
        scores.put(currentBestTeam, 0);

        for (int i = 0; i < competitions.length; i++) {
            String homeTeam = competitions[i].split(",")[0];
            String awayTeam = competitions[i].split(",")[1];
            if (results[i] == HOME_TEAM_WON) {
                winningTeam = homeTeam;
            } else {
                winningTeam = awayTeam;
            }
            updateScores(winningTeam, scores);
            if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
                currentBestTeam = winningTeam;
            }
        }
        return currentBestTeam;
    }

    private void updateScores(String team, Map<String, Integer> scores) {
        if (scores.containsKey(team)) {
            scores.replace(team, scores.get(team), scores.get(team) + 3);
        } else {
            scores.put(team, 3);
        }
    }
}
