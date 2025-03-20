package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final int ROUNDS = 3; // Количество раундов
    private static final int START_NUMBER = 100; // Чтобы выбрать начало прогрессии
    private static final int STEP_NUMBER = 15; // Шаг между членами прогрессии
    private static final int MIN_COUNT_NUMBERS = 10; // Минимально кол-во членов прогресси
    private static final int MAX_COUNT_NUMBERS = 10; // Максимально кол-во членов прогресии
    private static final int DATA_SIZE = ROUNDS * 2; // Размер массива для вопросв и ответов

    public static String[] returnDataForProgression() {
        String[] data = new String[DATA_SIZE];
        String answer = "";
        int countNumbersInProgression;
        int indexUnknownNumber;
        int start;
        int step;

        for (int i = 0; i < ROUNDS; i++) {
            countNumbersInProgression = Util.randomWithBoard(MIN_COUNT_NUMBERS, MAX_COUNT_NUMBERS);
            indexUnknownNumber = Util.randomWithBoard(2, countNumbersInProgression - 1);
            start = Util.randomWithBoard(0, START_NUMBER);
            step = Util.randomWithBoard(1, STEP_NUMBER);

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
            data[i + ROUNDS] = answer;
        }
        return data;
    }

    public static void gameProgression() {
        Util.greetingUser();

        System.out.println("What number is missing in the progression?");

        Engine.check(returnDataForProgression());
    }
}
