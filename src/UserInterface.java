import java.util.Scanner;

public class UserInterface extends Game {

    private final Scanner scanner = new Scanner(System.in);
    private final String[] commands = {"please enter a single letter and press enter","Correct", "Incorrect, you lose a life.", "Well done you won"};
    private int numberOflives = 3;

    public String getCommands(int input) {
        return commands[input];
    }

    public void printGreeting() {
        System.out.println("Welcome to Hangman! The clue to your word is laid out below.");
        System.out.println("You have " + numberOflives + " lives");
        for (int i= 0; i < super.selectedWord.length(); i++) {
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

}
