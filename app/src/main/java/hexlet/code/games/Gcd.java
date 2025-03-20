package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Gcd {
    private static final int ROUNDS = 3; // Количество раундов
    private static final int MAX_NUMBER = 100; // Максимальное число для генерации
    private static final int DATA_SIZE = ROUNDS * 2; // Размер массива для вопросв и ответов

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static String[] returnDataForGcd() {
        String[] data = new String[DATA_SIZE];

        for (int i = 0; i < 3; i++) {
            int numberOne = Util.randomWithBoard(0, MAX_NUMBER);
            int numberTwo = Util.randomWithBoard(0, MAX_NUMBER);

            String numberOneString = String.valueOf(numberOne);
            String numberTwoString = String.valueOf(numberTwo);

            int answerInteger = gcd(numberOne, numberTwo);
            String answerString = String.valueOf(answerInteger);

            String question = numberOneString + " " + numberTwoString;

            data[i] = question;
            data[i + 3] = answerString;
        }
        return data;
    }

    public static void gameGcd() {
        Util.greetingUser();

        System.out.println("Find the greatest common divisor of given numbers.");

        Engine.check(returnDataForGcd());
    }
}
