package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Issue24GenerateDocumentTest {

    private static final String CHARACTERS = "Bste!hetsi ogEAxpelrt x ";
    private static final String DOCUMENT = "AlgoExpert is the Best!";

    @Test
    void generateDocument() {
        assertTrue(Issue24GenerateDocument.generateDocument(CHARACTERS, DOCUMENT));
    }

    @Test
    void generateDocument2() {
        assertTrue(Issue24GenerateDocument.generateDocument2(CHARACTERS, DOCUMENT));
    }

    @Test
    void generateDocument3() {
        assertTrue(Issue24GenerateDocument.generateDocument3(CHARACTERS, DOCUMENT));
    }
}