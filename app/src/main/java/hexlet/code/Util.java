package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Util {
    static String userName;

    public static void greetingUser() {
        Scanner scanner = new Scanner((System.in));

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        userName = scanner.next();

        System.out.println(("Hello, " + userName + "!"));
    }

    public static int randomWithBoard(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
