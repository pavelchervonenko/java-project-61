package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final int MAX_NUMBER = 150; // Максимальное число для генерации
    private static final int PARE = 2;

    public static boolean isPrime(int numberInteger) {
        int flag = 0;

        for (int j = 2; j * j <= numberInteger; j++) {
            if (numberInteger % j == 0) {
                flag = 1;
                break;
            }
        }
        return flag == 0;
    }
    public static String[][] returnDataForPrime() {
        String[][] data = new String[Engine.ROUNDS][PARE];
        int numberInteger;

        for (int i = 0; i < Engine.ROUNDS; i++) {
            numberInteger = Util.randomWithBoard(2, MAX_NUMBER);

            String numberString = String.valueOf(numberInteger);
            data[i][0] = numberString;

            data[i][1] = isPrime(numberInteger) ? "yes" : "no";

        }
        return data;
    }

    public static void gamePrime() {
        String[][] gameData = returnDataForPrime();
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        Engine.gameStart(gameData, rule);
    }
}
