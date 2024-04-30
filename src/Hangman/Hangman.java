package Hangman;

import Hangman.Words.LevelOne;
import Hangman.Words.LevelTwo;
import Hangman.Words.Words;

public class Hangman {
    private Words wordList;
    private String selectedWord;
    private ResultsOfGuess wordsToBeSearched;
    private UserInterface control;

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
        control.getStringInput();
    }

    public void playLevel() {
        // welcome
        boolean endGame = false;
        while (!endGame) {
            control.printGreeting(selectedWord);

            //set Control to take string integer

            while(!wordsToBeSearched.allLettersFound() && control.getLives() > 0) {
                if (control.getLives() != 3) {
                    System.out.println("Previous incorrect guesses [ " + wordsToBeSearched.getGuesses() +"]");
                }
                System.out.println(control.getCommands(0));
                String input = control.getStringInput();
                if (selectedWord.contains(input) && wordsToBeSearched.checkIfPreviouslyGuessed(input)) {
                    System.out.println(control.getCommands(1));
                    System.out.println(wordsToBeSearched.revealLetters(input));
                }
                else if (selectedWord.contains(input) && !wordsToBeSearched.checkIfPreviouslyGuessed(input)) {
                    System.out.println(control.getCommands(5));
                    System.out.println(wordsToBeSearched.revealLetters(input));
                }
                else {
                    System.out.println(control.getCommands(2));
                    control.failedGuess();
                    wordsToBeSearched.saveGuess(input);
                    System.out.println(wordsToBeSearched.revealLetters(input));
                    control.printHangman();
                }
            }
            if (control.getLives() == 0) {
                System.out.println(control.getCommands(4));

            }
            else {
                System.out.println(control.getCommands(3));
            }
            System.out.println(control.getCommands(6));
            int finish = control.getLevelSelect();
            if (finish == 2) {
                endGame = true;
            }
            else {
                control.setLives();
                selectedWord = wordList.getWord();
                wordsToBeSearched = new ResultsOfGuess(selectedWord);
                control.getStringInput();
            }
        }

    }

}
