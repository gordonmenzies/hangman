package Hangman;

import Hangman.Words.LevelOne;
import Hangman.Words.LevelTwo;
import Hangman.Words.Words;

public class Hangman {
    private Words wordList;
    private String selectedWord;
    private ResultsOfGuess wordsToBeSearched;
    private final UserInterface control;

    public Hangman() {
        this.control = new UserInterface();
    }

    public void selectLevel() {
        boolean levelSelected = false;
        System.out.println("************* Welcome to Hangman! *************");
        while (!levelSelected) {
        System.out.println("please select a level of difficulty, enter 1 for the lowest level and 2 for more difficult");
            int input = control.getLevelSelect();
            if (input == 1) {
                wordList = new LevelOne();
                selectedWord = wordList.getWord();
                wordsToBeSearched = new ResultsOfGuess(selectedWord);
                levelSelected = true;
            }
            else if (input == 2) {
                wordList = new LevelTwo();
                selectedWord = wordList.getWord();
                wordsToBeSearched = new ResultsOfGuess(selectedWord);
                levelSelected = true;
            }
            else {
                System.out.println("Please enter a valid input, either one or two");
            }
        }

    }

    public void playLevel() {

        boolean endGame = false;

        while (!endGame) {
            control.clearScanner();
            control.printGreeting(selectedWord);

            while (!wordsToBeSearched.allLettersFound() && control.getLives() > 0) {
                if (control.getLives() != 3) {
                    System.out.println("Previous incorrect guesses [ " + wordsToBeSearched.getGuesses() + "]");
                }
                System.out.println(control.getCommands(0));

                String input = control.getStringInput();
                if (selectedWord.contains(input) && wordsToBeSearched.checkIfPreviouslyGuessed(input)) {
                    System.out.println(control.getCommands(1));
                    System.out.println(wordsToBeSearched.revealLetters(input));
                } else if (selectedWord.contains(input) && !wordsToBeSearched.checkIfPreviouslyGuessed(input)) {
                    System.out.println(control.getCommands(5));
                    System.out.println(wordsToBeSearched.revealLetters(input));
                } else {
                    System.out.println(control.getCommands(2));
                    control.failedGuess();
                    wordsToBeSearched.saveGuess(input);
                    System.out.println(wordsToBeSearched.revealLetters(input));
                    control.printHangman();
                }
            }
            if (control.getLives() == 0) {
                System.out.println(control.getCommands(4));
                endGame = playAgain();

            } else {
                System.out.println(control.getCommands(3));
                endGame = playAgain();
            }
        }
    }

    private boolean playAgain() {
            System.out.println(control.getCommands(6));
            boolean restart = false;
            while (!restart) {
                int finish = control.getLevelSelect();
                if (finish == 2) {
                    return true;
                }
                else if (finish == 1) {
                    control.setLives();
                    selectedWord = wordList.getWord();
                    wordsToBeSearched = new ResultsOfGuess(selectedWord);
                    System.out.println("************ NEW GAME *************");
                    return false;
                }
                else {
                    System.out.println("Please enter an input of either 1 or 2");
                }
            }
            return false;
        }


}
