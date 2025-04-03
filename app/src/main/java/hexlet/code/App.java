package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

class App {
    public static String userChoiceInMenu() {
        Scanner scannerSelectGame = new Scanner(System.in);
        return scannerSelectGame.next();
    }

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");

        String[] menu = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};

        for (var section : menu) {
            System.out.println(section);
        }

        System.out.print("Your choice: ");

        String choice = userChoiceInMenu();
        switch (choice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.gameEven();
                break;
            case "3":
                Calc.gameCalc();
                break;
            case "4":
                Gcd.gameGcd();
                break;
            case "5":
                Progression.gameProgression();
                break;
            case "6":
                Prime.gamePrime();
                break;
            case "0":
                System.out.println("Bye!");
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("You entered the wrong value: " + choice);
        }
    }
}
