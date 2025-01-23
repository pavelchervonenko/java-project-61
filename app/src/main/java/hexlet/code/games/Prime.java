package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static int returnRandomNumber() {
        Random random = new Random();
        final int min = 2;
        final int max = 150;
        return random.nextInt(max - min + 1) + min;
    }

    public static String returnCorrectAnswer(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
