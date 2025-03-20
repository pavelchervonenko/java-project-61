package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final int ROUNDS = 3; // Количество раундов
    private static final int MAX_NUMBER = 100; // Максимальное число для генерации
    private static final int DATA_SIZE = ROUNDS * 2; // Размер массива для вопросв и ответов

    public static String[] returnDataForEven() {
        String[] data = new String[DATA_SIZE];
        int numberInteger;

        for (int i = 0; i < ROUNDS; i++) {
            numberInteger = Util.randomWithBoard(1, MAX_NUMBER);

            String numberString = String.valueOf(numberInteger);
            data[i] = numberString;

            if (numberInteger % 2 == 0) {
                data[i + ROUNDS] = "yes";
            } else {
                data[i + ROUNDS] = "no";
            }
        }
        return data;
    }

    public static void gameEven() {
        Util.greetingUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Engine.check(returnDataForEven());
    }
}
