package Hangman;

public class LevelOne extends Words {
    private final String[] oneWords = {"Chicken", "Tomboy", "Neanderthal"};

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
