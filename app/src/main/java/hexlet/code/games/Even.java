package hexlet.code.games;

import java.util.Random;

public class Even {
    public static int generationRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }
}

