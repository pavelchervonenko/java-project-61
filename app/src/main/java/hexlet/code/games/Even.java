package hexlet.code.games;

import java.util.Random;

public class Even {
    public static int generationRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public static int[] returnDataEven() {
        int[] randomNumbers = new int[3];

        for (int i = 0; i < 3; i++) {
            randomNumbers[i] = generationRandomNumber();
        }
        return randomNumbers;
    }
}

