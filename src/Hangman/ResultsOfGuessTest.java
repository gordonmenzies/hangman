package Hangman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultsOfGuessTest {

    private ResultsOfGuess underScoreExample;
    private ResultsOfGuess completeExample;

    @BeforeEach
    void setUp() {
        underScoreExample  = new ResultsOfGuess("example");
        completeExample = new ResultsOfGuess("complete");
    }

    @Test
    @DisplayName("allLettersFound_ReturnFalse_underscoreExample")
    void allLettersFound_returnFalse() {
        boolean result = underScoreExample.allLettersFound();
        assertFalse(result);
    }

    @Test
    @DisplayName("allLettersFound_ReturnTrue_completeExample")
    void allLettersFound_returnTrue() {
        String fullword = completeExample.revealLetters("c");
        fullword = completeExample.revealLetters("c");
        fullword = completeExample.revealLetters("o");
        fullword = completeExample.revealLetters("m");
        fullword = completeExample.revealLetters("p");
        fullword = completeExample.revealLetters("l");
        fullword = completeExample.revealLetters("e");
        fullword = completeExample.revealLetters("t");
        fullword = completeExample.revealLetters("e");
        boolean result = completeExample.allLettersFound();
        assertTrue(result);
    }

    @Test
    @DisplayName("revealLetters_lettersRevealed_underscoreExample")
    void revealLetters_RevealLetters() {
        String result = underScoreExample.revealLetters("x");
        assertEquals("_x_____", result);
    }

    @Test
    @DisplayName("revealLetters_noLettersRevealed_underscoreExample")
    void revealLetters_NoLettersRevealed() {
        String result = underScoreExample.revealLetters("d");
        assertEquals("_______", result);
    }


    @Test
    @DisplayName("checkPreviouslyGuessed_addLetter_underscoreExample")
    void checkIfPreviouslyGuessed() {
        String result = underScoreExample.revealLetters("x");
        assertFalse(underScoreExample.checkIfPreviouslyGuessed("x"));

    }
}