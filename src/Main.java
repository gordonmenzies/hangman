//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // select the word
        Game wordList = new Game();
        wordList.selectRandomWord();

        // create the char array
        ResultsOfGuess wordsToBeSearched = new ResultsOfGuess();

        // establish the possible actions
        UserInterface control = new UserInterface();

        // welcome
        control.printGreeting();

        while(!wordsToBeSearched.allLettersFound()) {
            System.out.println(control.getCommands(0));
            String input = control.getStringInput();
            if (wordList.getWord().contains(input)) {
                System.out.println(control.getCommands(1));
                System.out.println(wordsToBeSearched.revealLetters(input));
            }
            else {
                System.out.println(control.getCommands(2));
                control.reduceNumberOfLives();
            }
        }
        System.out.println(control.getCommands(3));
        }
    }
