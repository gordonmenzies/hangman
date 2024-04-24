import java.sql.Array;
import java.util.ArrayList;

public class PossibleWords {

    String[] listOfWords = {"Chicken", "Tomboy", "Neanderthal"};

    private int generateRandomNumber() {
        int min = 0;
        int max = listOfWords.length -1;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public String getWord() {
        int selected = generateRandomNumber();
        return listOfWords[selected];
    }


}
