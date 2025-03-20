package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Gcd {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static String[] returnDataForGcd() {
        String[] data = new String[6];

        for (int i = 0; i < 3; i++) {
            int numberOne = Util.randomWithBoard(0, 100);
            int numberTwo = Util.randomWithBoard(0, 100);

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
