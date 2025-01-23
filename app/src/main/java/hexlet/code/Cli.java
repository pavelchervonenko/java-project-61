package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scannerName = new Scanner((System.in));

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scannerName.next();
        System.out.println(("Hello, " + name + "!"));

        scannerName.close();
    }
}