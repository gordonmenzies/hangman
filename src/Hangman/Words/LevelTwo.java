package Hangman.Words;

public class LevelTwo extends Words {
    private final String[] oneWords = {"dynamite", "tarantula", "entropic", "illustrate","argumentative","intrepid","agnostic","impartial"};

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
