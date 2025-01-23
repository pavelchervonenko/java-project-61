package hexlet.code.games;

import java.util.Random;

public class Gcd {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static long generationRandomNumberGcd() {
        Random random = new Random();

        final long min = 1;
        final long max = 100;

        return random.nextLong(max - min + 1) + min;
    }

    public static long[] returnDataNumbersGcd() {
        long[] randomNumbers = new long[2];

        randomNumbers[0] = generationRandomNumberGcd();
        randomNumbers[1] = generationRandomNumberGcd();

        return randomNumbers;
    }
}