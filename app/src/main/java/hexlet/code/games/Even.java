package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Even {
    private static final int MAX_NUMBER = 100; // Максимальное число для генерации
    private static final int PARE = 2;

    public static String[][] returnDataForEven() {
        String[][] data = new String[Engine.ROUNDS][PARE];
        int numberInteger;

        for (int i = 0; i < Engine.ROUNDS; i++) {
            numberInteger = Util.randomWithBoard(1, MAX_NUMBER);

            String numberString = String.valueOf(numberInteger);
            data[i][0] = numberString;

            if (numberInteger % 2 == 0) {
                data[i][1] = "yes";
            } else {
                data[i][1] = "no";
            }
        }
        return data;
    }

    public static void gameEven() {
        Engine.gameEven();
    }
}
