import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner = new Scanner(System.in);
    private String[] commands = {"please enter a single letter and press enter","Correct", "Incorrect, you lose a life.", "Well done you won"};
    private int numberOflives = 3;

    public String getCommands(int input) {
        return commands[input];
    }

    public void printGreeting(String selectedWord) {
        System.out.println("Welcome to Hangman! The clue to your word is laid out below.");
        System.out.println("You have " + numberOflives + " lives");
        System.out.println("selected word: " + selectedWord);
        for (int i= 0; i < selectedWord.length(); i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public String getStringInput() {
        return scanner.nextLine();
    }

    public void reduceNumberOfLives() {
        numberOflives = numberOflives - 1;
        System.out.print("only" + numberOflives + "remaining");
    }

    public int getNumberOfLives() {
        return numberOflives;
    }


}
