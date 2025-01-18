package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static int[] returnDataNumbersCalc() {
        int[] randomNumbers = new int[2];

        randomNumbers[0] = Even.generationRandomNumber();
        randomNumbers[1] = Even.generationRandomNumber();

        return randomNumbers;
    }

    public static String returnDataOperationCalc() {
        String[] dataOperationsCals = {"-", "+", "*"};
        Random random = new Random();
        return dataOperationsCals[random.nextInt(3)];
    }
}
