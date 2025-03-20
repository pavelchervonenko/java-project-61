package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    public static String[] returnDataForProgression() {
        String[] data = new String[6];
        String answer = "";
        int countNumbersInProgression;
        int indexUnknownNumber;
        int start;
        int step;

        for (int i = 0; i < 3; i++) {
            countNumbersInProgression = Util.randomWithBoard(10, 15);
            indexUnknownNumber = Util.randomWithBoard(2, countNumbersInProgression - 1);
            start = Util.randomWithBoard(0, 100);
            step = Util.randomWithBoard(1, 15);

            String[] progression = new String[countNumbersInProgression];

            int coeff = 1;
            for (int j = 0; j < countNumbersInProgression; j++) {
                int temp = start + (step * coeff);
                coeff++;

                if (j == indexUnknownNumber) {
                    answer = String.valueOf(temp);
                    progression[j] = "..";
                    continue;
                }
                progression[j] = String.valueOf(temp);
            }
            String question = String.join(" ", progression);

            data[i] = question;
            data[i + 3] = answer;
        }
        return data;
    }

    public static void gameProgression() {
        Util.greetingUser();

        System.out.println("What number is missing in the progression?");

        Engine.check(returnDataForProgression());
    }
}
