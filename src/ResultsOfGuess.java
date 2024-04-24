import java.util.Arrays;

public class ResultsOfGuess {

    private final String selectedWord;
    private final char[] letterIndex;
    private char[] guesses;

    public ResultsOfGuess(String selectedString) {
        this.selectedWord = selectedString;
        this.letterIndex = new char[selectedString.length()];
        Arrays.fill(letterIndex, '_');
        this.guesses = new char[selectedString.length()];
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
}
