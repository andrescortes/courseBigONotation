package algorithm.algoexpert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Issue4TournamentWinnerTest {

    private final String[] COMPETITIONS = {
            "HTML,C#",
            "C#,Python",
            "Python,HTML"
    };
    private final int[] RESULTS = {0, 0, 1};
    private Issue4TournamentWinner issue4TournamentWinner;

    @BeforeEach
    void setUp() {
        issue4TournamentWinner = new Issue4TournamentWinner();
    }

    @Test
    void tournamentWinner() {
        String expectedWinner = "Python";
        String winner = issue4TournamentWinner.tournamentWinner(COMPETITIONS, RESULTS);
        assertEquals(expectedWinner, winner);
    }
}