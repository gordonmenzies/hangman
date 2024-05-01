package Hangman.Words;

public class LevelOne extends Words {
    private final String[] oneWords = {"chicken", "tomboy", "hello","nice","easy","tuna","bard"};

    @Override
    public int generateRandomNumber() {
        int min = 0;
        int max = oneWords.length -1;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    @Override
    public String getWord() {
        int selected = generateRandomNumber();
        return oneWords[selected].toLowerCase();
    }

}
