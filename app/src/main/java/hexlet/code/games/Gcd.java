package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Gcd {
    private static final int MAX_NUMBER = 100; // Максимальное число для генерации
    private static final int PARE = 2;

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static String[][] returnDataForGcd() {
        String[][] data = new String[Engine.ROUNDS][PARE];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int numberOne = Util.randomWithBoard(0, MAX_NUMBER);
            int numberTwo = Util.randomWithBoard(0, MAX_NUMBER);

            String numberOneString = String.valueOf(numberOne);
            String numberTwoString = String.valueOf(numberTwo);

            int answerInteger = gcd(numberOne, numberTwo);
            String answerString = String.valueOf(answerInteger);

            String question = numberOneString + " " + numberTwoString;

            data[i][0] = question;
            data[i][1] = answerString;
        }
        return data;
    }

    public static void gameGcd() {
        Engine.gameGcd();
    }
}
