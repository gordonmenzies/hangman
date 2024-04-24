public class Game {

    private final String[] listOfWords = {"Chicken", "Tomboy", "Neanderthal"};
    protected String selectedWord;

    private int generateRandomNumber() {
        int min = 0;
        int max = listOfWords.length -1;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public void selectRandomWord() {
        int selected = generateRandomNumber();
        selectedWord = listOfWords[selected].toLowerCase();
    }

    public String getWord() {
        return selectedWord;
    }

}
