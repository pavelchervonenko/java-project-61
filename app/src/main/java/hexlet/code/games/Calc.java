package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static int generationRandomNumber() {
        Random random = new Random();
        final int max = 101;
        return random.nextInt(max);
    }

    public static int[] returnDataNumbersCalc() {
        int[] randomNumbers = new int[2];

        randomNumbers[0] = generationRandomNumber();
        randomNumbers[1] = generationRandomNumber();

        return randomNumbers;
    }

    public static String returnDataOperationCalc() {
        Random random = new Random();
        String[] dataOperationsCals = {"-", "+", "*"};

        return dataOperationsCals[random.nextInt(3)];
    }
}