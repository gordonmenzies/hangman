package Hangman;

public class LevelTwo extends Words {
    private final String[] oneWords = {"Dynamite", "Tarantula", "Entropic"};

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
