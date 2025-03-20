package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final int ROUNDS = 3; // Количество раундов
    private static final int MAX_NUMBER = 150; // Максимальное число для генерации
    private static final int DATA_SIZE = ROUNDS * 2; // Размер массива для вопросв и ответов

    public static String[] returnDataForPrime() {
        String[] data = new String[DATA_SIZE];
        int numberInteger;

        for (int i = 0; i < ROUNDS; i++) {
            numberInteger = Util.randomWithBoard(2, MAX_NUMBER);

            String numberString = String.valueOf(numberInteger);
            data[i] = numberString;

            int flag = 0;
            for (int j = 2; j * j <= numberInteger; j++) {
                if (numberInteger % j == 0) {
                    data[i + ROUNDS] = "no";
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                data[i + ROUNDS] = "yes";
            }

        }
        return data;
    }

    public static void gamePrime() {
        Util.greetingUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Engine.check(returnDataForPrime());
    }
}
