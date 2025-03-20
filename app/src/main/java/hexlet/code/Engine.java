package hexlet.code;

import java.util.Scanner;

// Формат массива data -> [вопрос1, вопрос2, вопрос3, ответ1, ответ2, ответ3]
// То есть, ответ1 соответсвует правильному ответу на вопрос1
// int i = 0;
// data[i] = вопрос1, а data[i + 3] = ответ на вопрос1, и так далее...
// Прибавляем всегда 3, так как три раунда и на каждый уникальный набор данных

public class Engine {
    private static final int ROUNDS = 3;

    public static void check(String[] data) {
        int countCorrectAnswer = 0;

        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + data[i]);
            System.out.print("Your answer: ");

            Scanner scannerUserAnswer = new Scanner(System.in);
            String userAnswer = scannerUserAnswer.next();

            if (userAnswer.equals(data[i + ROUNDS])) {
                System.out.println("Correct");
                countCorrectAnswer += 1;

                if (countCorrectAnswer == ROUNDS) {
                    System.out.println("Congratulations, " + Util.getUserName() + "!");
                }
            } else {
                System.out.print("'" + userAnswer + "' " + "is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + data[i + ROUNDS] + "'.");

                System.out.println("Let's try again, " + Util.getUserName() + "!");
                System.exit(0);
            }
        }
    }
}
