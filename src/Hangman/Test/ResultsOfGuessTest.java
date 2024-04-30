package Hangman.Test;

import Hangman.ResultsOfGuess;
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
        completeExample.revealLetters("c");
        completeExample.revealLetters("c");
        completeExample.revealLetters("o");
        completeExample.revealLetters("m");
        completeExample.revealLetters("p");
        completeExample.revealLetters("l");
        completeExample.revealLetters("e");
        completeExample.revealLetters("t");
        completeExample.revealLetters("e");
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
        underScoreExample.revealLetters("x");
        assertFalse(underScoreExample.checkIfPreviouslyGuessed("x"));

    }
}