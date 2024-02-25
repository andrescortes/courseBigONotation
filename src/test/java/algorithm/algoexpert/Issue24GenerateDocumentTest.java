package algorithm.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Issue24GenerateDocumentTest {

    @Test
    void generateDocument() {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        assertTrue(Issue24GenerateDocument.generateDocument(characters, document));
    }
}