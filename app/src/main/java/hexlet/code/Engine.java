package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

// Формат двумерного массива data -> [[вопрос1, ответ1], [вопрос2, ответ2], [вопрос3, ответ3]]
// int i = 0;
// data[i][0] = вопрос1, а data[i][1] = ответ на вопрос1, и так далее...

public class Engine {
    public static final int ROUNDS = 3;

    public static String greetingUser() {
        Scanner scannerName = new Scanner((System.in));

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String userName = scannerName.next();

        System.out.println(("Hello, " + userName + "!"));

        return userName;
    }

    public static void gameEven() {
        String userName = greetingUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        check(Even.returnDataForEven(), userName);
    }

    public static void gameCalc() {
        String userName = greetingUser();

        System.out.println("What is the result of the expression?");

        check(Calc.returnDataForCalc(), userName);
    }

    public static void gameGcd() {
        String userName = greetingUser();

        System.out.println("Find the greatest common divisor of given numbers.");

        check(Gcd.returnDataForGcd(), userName);
    }

    public static void gameProgression() {
        String userName = greetingUser();

        System.out.println("What number is missing in the progression?");

        check(Progression.returnDataForProgression(), userName);
    }

    public static void gamePrime() {
        String userName = greetingUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        check(Prime.returnDataForPrime(), userName);
    }


    public static void check(String[][] data, String userName) {
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + data[i][0]);
            System.out.print("Your answer: ");

            Scanner scannerUserAnswer = new Scanner(System.in);
            String userAnswer = scannerUserAnswer.next();

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
