package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;

import java.util.Scanner;

public class Engine {
    static final int ROUNDS = 3;

    public static void selectGreet() {
        UserInteraction.greetingUser();
    }

    public static void selectEven() {

        UserInteraction.greetingUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int countCorrectAnswer = 0;

        for (int i = 0; i < ROUNDS; i++) {
            int currentNumber = Even.generationRandomNumber();
            String correctAnswer = currentNumber % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + currentNumber);
            System.out.print("Your answer: ");

            Scanner scannerUserAnswer = new Scanner(System.in);
            String userAnswer = scannerUserAnswer.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct");
                countCorrectAnswer += 1;
                if (countCorrectAnswer == ROUNDS) {
                    UserInteraction.congratulationsUser();
                }
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");

                UserInteraction.wrongAnswerUser();
                System.exit(0);
            }
        }
    }

    public static void selectCalc() {

        UserInteraction.greetingUser();

        System.out.println("What is the result of the expression?");

        int countCorrectAnswer = 0;

        for (int i = 0; i < ROUNDS; i++) {
            int[] dataNumbersCalc = Calc.returnDataNumbersCalc();
            String currentOperation = Calc.returnDataOperationCalc();

            int currentNumberOne = dataNumbersCalc[0];
            int currentNumberTwo = dataNumbersCalc[1];

            String correctAnswer = "";
            switch (currentOperation) {
                case "-":
                    correctAnswer = String.valueOf(currentNumberOne - currentNumberTwo);
                    break;
                case "+":
                    correctAnswer = String.valueOf(currentNumberOne + currentNumberTwo);
                    break;
                case "*":
                    correctAnswer = String.valueOf(currentNumberOne * currentNumberTwo);
                    break;
                default:
                    System.out.println("Error: unknown operation");
            }

            System.out.println("Question: " + currentNumberOne + " " + currentOperation + " " + currentNumberTwo);
            System.out.print("Your answer: ");

            Scanner scannerUserAnswer = new Scanner(System.in);
            String userAnswer = scannerUserAnswer.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                countCorrectAnswer += 1;
                if (countCorrectAnswer == ROUNDS) {
                    UserInteraction.congratulationsUser();
                }
            } else {
                System.out.print("'" + userAnswer + "' " + "is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + correctAnswer + "'.");

                UserInteraction.wrongAnswerUser();
                System.exit(0);
            }
        }
    }

    public static void selectGcd() {

        UserInteraction.greetingUser();

        System.out.println("Find the greatest common divisor of given numbers.");

        int countCorrectAnswer = 0;

        for (int i = 0; i < ROUNDS; i++) {
            long[] dataNumbersGcd = Gcd.returnDataNumbersGcd();

            long currentNumberOne = dataNumbersGcd[0];
            long currentNumberTwo = dataNumbersGcd[1];

            long correctAnswer = Gcd.gcd(currentNumberOne, currentNumberTwo);

            System.out.println("Question: " + currentNumberOne + " " + currentNumberTwo);
            System.out.print("Your answer: ");

            Scanner scannerUserAnswer = new Scanner(System.in);
            if (!scannerUserAnswer.hasNextLong()) {
                var currentScannerUserAnswer = scannerUserAnswer.next();

                System.out.print("'" + currentScannerUserAnswer + "' " + "is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + correctAnswer + "'.");

                UserInteraction.wrongAnswerUser();
                System.exit(0);
            }

            long userAnswer = scannerUserAnswer.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                countCorrectAnswer += 1;
                if (countCorrectAnswer == ROUNDS) {
                    UserInteraction.congratulationsUser();
                }
            } else {
                System.out.print("'" + userAnswer + "' " + "is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + correctAnswer + "'.");

                UserInteraction.wrongAnswerUser();
                System.exit(0);
            }
        }
    }
    public static void selectProgression() {

        UserInteraction.greetingUser();

        System.out.println("What number is missing in the progression?");

        int countCorrectAnswer = 0;

        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + Progression.finalProgressionInString());

            int correctAnswer = Progression.returnCorrectAnswer();

            System.out.print("Your answer: ");

            Scanner scannerUserAnswer = new Scanner(System.in);
            if (!scannerUserAnswer.hasNextLong()) {
                var currentScannerUserAnswer = scannerUserAnswer.next();

                System.out.print("'" + currentScannerUserAnswer + "' " + "is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + correctAnswer + "'.");

                UserInteraction.wrongAnswerUser();
                System.exit(0);
            }

            int userAnswer = scannerUserAnswer.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                countCorrectAnswer += 1;
                if (countCorrectAnswer == ROUNDS) {
                    UserInteraction.congratulationsUser();
                }
            } else {
                System.out.print("'" + userAnswer + "' " + "is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + correctAnswer + "'.");

                UserInteraction.wrongAnswerUser();
                System.exit(0);
            }
        }
    }

    public static void selectPrime() {
        UserInteraction.greetingUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int countCorrectAnswer = 0;

        for (int i = 0; i < ROUNDS; i++) {
            int number = Prime.returnRandomNumber();
            String correctAnswer = Prime.returnCorrectAnswer(number);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            Scanner scannerUserAnswer = new Scanner(System.in);
            String userAnswer = scannerUserAnswer.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                countCorrectAnswer += 1;
                if (countCorrectAnswer == ROUNDS) {
                    UserInteraction.congratulationsUser();
                }
            } else {
                System.out.print("'" + userAnswer + "' " + "is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + correctAnswer + "'.");

                UserInteraction.wrongAnswerUser();
                System.exit(0);
            }
        }
    }
}
