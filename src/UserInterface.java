import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner = new Scanner(System.in);
    private String[] commands = {};

    public String getCommands(int input) {
        return commands[input];
    }

    public void printGreeting(String selectedWord) {
        System.out.println("Welcome to Hangman! The clue to your word is laid out below.");
        System.out.println("selected word: " + selectedWord);
        for (int i= 0; i < selectedWord.length(); i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String getStringInput() {
        return scanner.nextLine();
    }
}
