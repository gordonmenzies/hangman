import java.util.Arrays;

public class ResultsOfGuess extends Game {

    private final char[] letterIndex;
    private char[] guesses;

    public ResultsOfGuess() {
        this.letterIndex = new char[super.selectedWord.length()];
        Arrays.fill(letterIndex, '_');
        this.guesses = new char[super.selectedWord.length()];
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
        for(int i = 0; i < super.selectedWord.length(); i++) {
            if (super.selectedWord.charAt(i) == preppedNewLetter) {
                letterIndex[i] = preppedNewLetter;
            }
        }
        return new String(letterIndex);
    }
}
