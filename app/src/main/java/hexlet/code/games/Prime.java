package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public static String[] returnDataForPrime() {
        String[] data = new String[6];
        int numberInteger;

        for (int i = 0; i < 3; i++) {
            numberInteger = Util.randomWithBoard(2, 150);

            String numberString = String.valueOf(numberInteger);
            data[i] = numberString;

            int flag = 0;
            for (int j = 2; j * j <= numberInteger; j++) {
                if (numberInteger % j == 0) {
                    data[i + 3] = "no";
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                data[i + 3] = "yes";
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
