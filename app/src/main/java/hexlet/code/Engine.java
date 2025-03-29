package hexlet.code;

import java.util.Scanner;

// Формат двумерного массива data -> [[вопрос1, ответ1], [вопрос2, ответ2], [вопрос3, ответ3]]
// int i = 0;
// data[i][0] = вопрос1, а data[i][1] = ответ на вопрос1, и так далее...

public class Engine {
    public static final int ROUNDS = 3;

    public static String scanner() {
        Scanner scannerName = new Scanner((System.in));
        return scannerName.next();
    }

    public static void invitationToTheGame() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
    }

    public static void greetingUser(String userName) {
        System.out.println(("Hello, " + userName + "!"));
    }

    // Возможно, метод следует тоже разделить на контексты.
    // Или этого в целом достаточно??
    public static void check(String[][] data, String userName) {
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + data[i][0]);
            System.out.print("Your answer: ");

            String userAnswer = scanner();

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

    public static void gameStart(String[][] data, String rule) {
        invitationToTheGame(); // Приглашение к игре (грубо говоря заставка перед взаимодействием с user)

        String userName = scanner(); // Получаю имя пользователя

        greetingUser(userName); // Приветствую пользователя

        System.out.println(rule); // Показываю правило

        check(data, userName); // Задаю вопрос, проверяю ответ
    }
}
