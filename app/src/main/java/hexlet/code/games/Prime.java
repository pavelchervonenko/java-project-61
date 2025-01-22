package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static int returnRandomNumber() {
        Random random = new Random();
        int min = 2;
        int max = 150;
        return random.nextInt(max - min + 1) + min;
    }
    // i <= sqrt(number)
    public static String returnCorrectAnswer(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
