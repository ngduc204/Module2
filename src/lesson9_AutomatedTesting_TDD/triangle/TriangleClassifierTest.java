package lesson9_AutomatedTesting_TDD.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TriangleClassifierTest {

    @Test
    public void testClassify() {
        assertEquals("tam giác đều", TriangleClassifier.classify(2, 2, 2));
        assertEquals("tam giác cân", TriangleClassifier.classify(2, 2, 3));
        assertEquals("tam giác thường", TriangleClassifier.classify(2, 3, 4));
        assertEquals("không phải tam giác", TriangleClassifier.classify(0, 2, 2));
        assertEquals("không phải tam giác", TriangleClassifier.classify(-1, 2, 2));
    }
}
