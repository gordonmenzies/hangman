package Hangman;

import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner = new Scanner(System.in);
    private final String[] commands = {"please enter a letter and press enter","Correct", "Incorrect, you lose a life.", "Well done you won", "You ran out of lives maybe play again?", "letter already guessed","press 1 to play again or press 2 to finish"};
    private int numberOflives = 3;

    public String getCommands(int input) {
        return commands[input];
    }

    public void printGreeting(String selectedWord) {

        System.out.println("The clue to your word is laid out below.");
        System.out.println("You have " + numberOflives + " lives");

        for (int i= 0; i < selectedWord.length(); i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public String getStringInput() {
        return scanner.nextLine();
    }
    public int getLevelSelect() {
        return scanner.nextInt();
    }

    public void failedGuess() {
        numberOflives = numberOflives - 1;
        System.out.println("only " + numberOflives + " lives remaining");
    }

    public int getLives() {
        return numberOflives;
    }
    public void setLives() {
        numberOflives = 3;
    }

    public void printHangman() {
        if (numberOflives==2) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("=========");
        }
        if (numberOflives==1) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  |   O");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("=========");
        }
        if (numberOflives==0) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  |   O");
            System.out.println("  |  /|\\");
            System.out.println("  |  / \\");
            System.out.println("  |");
            System.out.println("=========");
        }
    }


}
