//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // select the word
        PossibleWords wordList = new PossibleWords();
        String selectedWord = wordList.getWord();


        // create the char array
        ResultsOfGuess wordsToBeSearched = new ResultsOfGuess(selectedWord);


        // establish the possible actions
        UserInterface control = new UserInterface();
        String[] commandOptions = new String[] {"please enter a single letter and press enter","Correct", "Incorrect", "Well done you won"};
        control.setCommands(commandOptions);


        // WELCOME
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
