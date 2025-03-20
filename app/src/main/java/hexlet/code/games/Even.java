package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static String[] returnDataForEven() {
        String[] data = new String[6];
        int numberInteger;

        for (int i = 0; i < 3; i++) {
            numberInteger = Util.randomWithBoard(1, 100);

            String numberString = String.valueOf(numberInteger);
            data[i] = numberString;

            if (numberInteger % 2 == 0) {
                data[i + 3] = "yes";
            }
            else {
                data[i + 3] = "no";
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
