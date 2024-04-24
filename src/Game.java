public class Game {

    private final String[] listOfWords = {"Chicken", "Tomboy", "Neanderthal"};


    private int generateRandomNumber() {
        int min = 0;
        int max = listOfWords.length -1;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public String getWord() {
        int selected = generateRandomNumber();
        return listOfWords[selected].toLowerCase();
    }

}
