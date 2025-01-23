package hexlet.code.games;

import java.util.Random;

public class Even {
    public static int generationRandomNumber() {
        Random random = new Random();
        final int max = 101;
        return random.nextInt(max);
    }
}