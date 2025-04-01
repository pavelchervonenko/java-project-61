package hexlet.code;

import java.util.Scanner;

// Формат двумерного массива data -> [[вопрос1, ответ1], [вопрос2, ответ2], [вопрос3, ответ3]]
// int i = 0;
// data[i][0] = вопрос1, а data[i][1] = ответ на вопрос1, и так далее...

public class Engine {
    public static final int ROUNDS = 3;

    public static void gameStart(String[][] data, String rule) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner((System.in));
        String userName = scanner.next();

        System.out.println(("Hello, " + userName + "!"));

        System.out.println(rule);

        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + data[i][0]);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next();

            if (userAnswer.equals(data[i][1])) {
                System.out.println("Correct");
            } else {
                System.out.print("'" + userAnswer + "' " + "is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + data[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
