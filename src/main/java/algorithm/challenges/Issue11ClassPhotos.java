package algorithm.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Issue11ClassPhotos {

    private Issue11ClassPhotos() {

    }

    // redShirtHeights = [5, 8, 1, 3, 4]
    // blueShirtHeights = [6, 9, 2, 4, 5]
    // O(n log n) time | O(1) space - where n is the number of queries
    public static boolean classPhotosSolution(List<Integer> redShirtHeights, List<Integer> blueShirtHeights) {
        redShirtHeights.sort(Collections.reverseOrder());
        blueShirtHeights.sort(Collections.reverseOrder());

        String shirtColorInFirstRow = (redShirtHeights.get(0) < blueShirtHeights.get(0)) ? "RED" : "BLUE";
        for (int idx = 0; idx < redShirtHeights.size(); idx++) {
            int redShirtHeight = redShirtHeights.get(idx);
            int blueShirtHeight = blueShirtHeights.get(idx);
            if (shirtColorInFirstRow.equals("RED")) {
                if (redShirtHeight >= blueShirtHeight) {
                    return false;
                }
            } else {
                if (blueShirtHeight >= redShirtHeight) {
                    return false;
                }
            }
        }
        return true;
    }
}
