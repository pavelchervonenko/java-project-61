package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final int MAX_NUMBER = 100; // Максимальное число для генерации
    private static final int PARE = 2;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String[][] returnDataForEven() {
        String[][] data = new String[Engine.ROUNDS][PARE];
        int numberInteger;

        for (int i = 0; i < Engine.ROUNDS; i++) {
            numberInteger = Util.randomWithBoard(1, MAX_NUMBER);

            String numberString = String.valueOf(numberInteger);
            data[i][0] = numberString;

            data[i][1] = isEven(numberInteger) ? "yes" : "no";
        }
        return data;
    }


    public static void gameEven() {
        String[][] gameData = returnDataForEven();
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.gameStart(gameData, rule);
    }
}
