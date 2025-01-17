package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void selectGreet() {
        UserInteraction.greetingUser();
    }

    public static void selectEven() {

        UserInteraction.greetingUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int[] dataEven = Even.returnDataEven();
        int countCorrectAnswer = 0;

        for (int i = 0; i < 3; i++) {
            int currentNumber = dataEven[i];
            String correctAnswer = currentNumber % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + currentNumber);
            System.out.print("Your answer: ");

            Scanner scannerUserAnswer = new Scanner(System.in);
            String userAnswer = scannerUserAnswer.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct");
                countCorrectAnswer += 1;
                if (countCorrectAnswer == 3) {
                    UserInteraction.congratulationsUser();
                }
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                UserInteraction.wrongAnswerUser();
                System.exit(0);
            }
        }
    }
}
