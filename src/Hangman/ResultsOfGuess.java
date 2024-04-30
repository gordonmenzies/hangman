package Hangman;

import java.util.Arrays;
import java.util.Objects;

public class ResultsOfGuess {

    private final String selectedWord;
    private final char[] letterIndex;
    private String guesses;

    public ResultsOfGuess(String selectedString) {
        this.selectedWord = selectedString;
        this.letterIndex = new char[selectedString.length()];
        Arrays.fill(letterIndex, '_');
        this.guesses = "";
    }

    public boolean allLettersFound() {
        for (char index : letterIndex) {
            if (index == '_') {
                return false;
            }
        }
        return true;
    }

    public String revealLetters(String newLetter) {
        char preppedNewLetter = newLetter.toLowerCase().charAt(0);
        for(int i = 0; i < selectedWord.length(); i++) {
            if (selectedWord.charAt(i) == preppedNewLetter) {
                letterIndex[i] = preppedNewLetter;
            }
        }
        return new String(letterIndex);
    }

    public void saveGuess(String guess) {
        guesses = guesses + guess + " ";
    }

    public String getGuesses() {
        if (Objects.equals(guesses, "")) {
            return "";
        }
        else {
            return guesses;
        }
    }

    public boolean checkIfPreviouslyGuessed(String input) {
        char preppedLetter = input.charAt(0);
        for (char letter : letterIndex) {
            if (letter == preppedLetter) {
                return false;
            }

        }
        return true;
    }
}
