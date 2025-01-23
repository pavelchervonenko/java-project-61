package hexlet.code;

import java.util.Scanner;

public class UserInteraction {
    static Scanner scanner = new Scanner((System.in));
    static String userName;

    public static void greetingUser() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        userName = scanner.next();

        System.out.println(("Hello, " + UserInteraction.userName + "!"));
    }

    public static void congratulationsUser() {
        System.out.println("Congratulations, " + UserInteraction.userName + "!");
    }

    public static void wrongAnswerUser() {
        System.out.println("Let's try again, " + UserInteraction.userName + "!");
    }
}
