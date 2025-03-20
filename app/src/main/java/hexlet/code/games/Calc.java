package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static String[] returnDataForCalc() {
        String[] data = new String[6];

        for (int i = 0; i < 3; i++) {
            int numberOne = Util.randomWithBoard(0, 100);
            int numberTwo = Util.randomWithBoard(0, 100);

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
            data[i + 3] = answerString;
        }
        return data;
    }

    public static void gameCalc() {
        Util.greetingUser();

        System.out.println("What is the result of the expression?");

        Engine.check(returnDataForCalc());
    }
}
