package Ola;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Simulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean isCompleted = false;
        do {
            try {
                System.out.println("Hello! How many dices would you like to roll?");
                int numberofDices = scanner.nextInt();
                isCompleted = true;
                System.out.println("Rolling " + numberofDices + " dices...");
                scanner.close();
                for (int i = 0; i < numberofDices; i++) {
                    int rolledNumber = rand.nextInt(6) + 1;
                    System.out.println(display(rolledNumber));
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }

        } while (!isCompleted);

    }

    /**
     * @param value
     * @return
     */
    static String display(int value) {
        return switch (value) {
            case 1 -> "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2 -> "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3 -> "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4 -> "---------\n| o   o |\n|       |\n| o   o |\n---------";
            case 5 -> "---------\n| o   o |\n|   o   |\n| o   o |\n---------";
            case 6 -> "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
            default -> "Invalid value";
        };

    }

}
