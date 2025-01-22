package hexlet.code.games;

import java.util.Random;

public class Progression {
    static int correctAnswer;
    static int indexUnknownNumber;
    static int countNumbersInProgression;

    public static int returnCountNumbersInProgression() {
        Random random = new Random();
        int min = 10;
        int max = 15;
        return random.nextInt(max - min + 1) + min;
    }

    public static int returnStartNumberInProgression() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int returnIndexUnknownNumberInProgression() {
        Random random = new Random();
        countNumbersInProgression = returnCountNumbersInProgression();
        int max = countNumbersInProgression - 1;
        int min = 3;
        return random.nextInt(max - min + 1) + min;
    }

    public static int returnStepInProgression() {
        Random random = new Random();
        int max = 15;
        int min = 1;
        return random.nextInt(max - min + 1) + min;
    }

    public static int[] FinalProgressionInInteger() {
        indexUnknownNumber = returnIndexUnknownNumberInProgression();
        int start = returnStartNumberInProgression();
        int step = returnStepInProgression();

        int[] progression = new int[countNumbersInProgression];
        progression[0] = start;

        for (int i = 1; i < countNumbersInProgression; i++) {
            progression[i] = start + (step * i);
        }

        correctAnswer = progression[indexUnknownNumber];
        return progression;
    }

    public static int returnCorrectAnswer() {
        return correctAnswer;
    }

    public static String FinalProgressionInString() {
        int[] progression = FinalProgressionInInteger();
        String[] result = new String[countNumbersInProgression];

        for (int i = 0; i < countNumbersInProgression; i++) {
            String current = String.valueOf(progression[i]);

            if (progression[i] == correctAnswer) {
                result[i] = "..";
                continue;
            }
            result[i] = current;
        }

        return String.join(" ", result);
    }
}


