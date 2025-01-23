package hexlet.code;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class App {
    public static int userChoiceInMenu() {
        Scanner scannerSelectGame = new Scanner(System.in);
        return scannerSelectGame.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");

        Map<String, Integer> menu = new LinkedHashMap<>();
        menu.put("Greet", 1);
        menu.put("Even", 2);
        menu.put("Calc", 3);
        menu.put("GCD", 4);
        menu.put("Progression", 5);
        menu.put("Prime", 6);
        menu.put("Exit", 0);

        menu.forEach((key, value) -> System.out.println(value + " - " + key));

        System.out.print("Your choice: ");

        switch (userChoiceInMenu()) {
            case 1:
                Engine.selectGreet();
                break;
            case 2:
                Engine.selectEven();
                break;
            case 3:
                Engine.selectCalc();
                break;
            case 4:
                Engine.selectGcd();
                break;
            case 5:
                Engine.selectProgression();
                break;
            case 6:
                Engine.selectPrime();
                break;
            case 0:
                System.out.println("Bye!");
                System.exit(0);
                break;
            default:
                System.out.println("You entered the wrong value. Try again.");
                break;
        }
    }
}
