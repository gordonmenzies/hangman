//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PossibleWords wordList = new PossibleWords();
        String selectedWord = wordList.getWord();

        // WELCOME
        System.out.println("Welcome to Hangman! The clue to your word is laid out below.");

        for (int i= 0; i < selectedWord.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();

        UserInterface firstCommand = new UserInterface();

        String[] commandOptions = new String[] {"please enter a single letter and press enter","Do something else", "Quit"};
        firstCommand.setCommands(commandOptions);

        // FIRST INSTRUCTION AND RECEIPT
        System.out.println(firstCommand.getCommands(0));
        String input = firstCommand.getStringInput();
        }

        // this is the only change on the branch Receiving-Input
    }
