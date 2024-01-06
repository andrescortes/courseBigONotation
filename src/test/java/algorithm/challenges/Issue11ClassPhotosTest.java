package algorithm.challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Issue11ClassPhotosTest {

    private final List<Integer> redShirtHeights = new ArrayList<>();
    private final List<Integer> blueShirtHeights = new ArrayList<>();
    @BeforeEach
    void setUp() {
        redShirtHeights.addAll(List.of(5, 8, 1, 3, 4));
        blueShirtHeights.addAll(List.of(6, 9, 2, 4, 5));
    }

    @Test
    void classPhotosSolution() {
        boolean result = Issue11ClassPhotos.classPhotosSolution(redShirtHeights, blueShirtHeights);
        assertTrue(result);
    }
}