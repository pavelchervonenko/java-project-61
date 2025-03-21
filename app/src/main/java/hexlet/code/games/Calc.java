package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import java.util.Scanner;


public class Calc {
    private static final int MAX_NUMBER = 100; // Максимальное число для генерации
    private static final int PARE = 2;

    public static String[][] returnDataForCalc() {
        String[][] data = new String[Engine.ROUNDS][PARE];

        for (int i = 0; i < Engine.ROUNDS; i++) {
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

            data[i][0] = question;
            data[i][1] = answerString;
        }
        return data;
    }

    public static void gameCalc() {
        Engine.gameCalc();
    }
}
