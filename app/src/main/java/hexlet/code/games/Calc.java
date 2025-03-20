package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final int ROUNDS = 3; // Количество раундов
    private static final int MAX_NUMBER = 100; // Максимальное число для генерации
    private static final int DATA_SIZE = ROUNDS * 2; // Размер массива для вопросв и ответов

    public static String[] returnDataForCalc() {
        String[] data = new String[DATA_SIZE];

        for (int i = 0; i < ROUNDS; i++) {
            int numberOne = Util.randomWithBoard(0, MAX_NUMBER);
            int numberTwo = Util.randomWithBoard(0, MAX_NUMBER);

            String[] operations = {"-", "+", "*"};
            int max = operations.length;
            String operation = operations[Util.randomWithBoard(0, max - 1)];

            int answerInteger = 0;
            switch (operation) {
                case "-":
                    answerInteger = numberOne - numberTwo;
                    break;
                case "+":
                    answerInteger = numberOne + numberTwo;
                    break;
                case "*":
                    answerInteger = numberOne * numberTwo;
                    break;
                default:
                    System.out.println("Error: unknown operation.");
                    break;
            }
            String numberOneString = String.valueOf(numberOne);
            String numberTwoString = String.valueOf(numberTwo);

            String answerString = String.valueOf(answerInteger);
            String question = numberOneString + " " + operation + " " + numberTwoString;

            data[i] = question;
            data[i + ROUNDS] = answerString;
        }
        return data;
    }

    public static void gameCalc() {
        Util.greetingUser();

        System.out.println("What is the result of the expression?");

        Engine.check(returnDataForCalc());
    }
}
