//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // select the word
        Game wordList = new Game();
        String selectedWord = wordList.getWord();

        // create the char array
        ResultsOfGuess wordsToBeSearched = new ResultsOfGuess(selectedWord);

        // establish the possible actions
        UserInterface control = new UserInterface();

        // welcome
        control.printGreeting(selectedWord);

        while(!wordsToBeSearched.allLettersFound()) {
            System.out.println(control.getCommands(0));
            String input = control.getStringInput();
            if (selectedWord.contains(input)) {
                System.out.println(control.getCommands(1));
                System.out.println(wordsToBeSearched.revealLetters(input));
            }
            else {
                System.out.println(control.getCommands(2));

            }
        }
        System.out.println(control.getCommands(3));





        }



    }
