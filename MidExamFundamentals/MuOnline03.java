package MidExamFundamentals;

import java.util.Scanner;

public class MuOnline03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("[|]"); // "rat 10", "bat 10"...

        int initialHealth = 100;
        int bitcoins = 0;
        boolean isNotDead = true;

        for (int i = 0; i < rooms.length; i++) {

            String[] commandArr = rooms[i].split(" ");
            String command = commandArr[0];
            int number = Integer.parseInt(commandArr[1]);
            if (command.equals("potion")) {
                int currentHealth = initialHealth;
                initialHealth = currentHealth + number;
                if (initialHealth > 100) {
                    initialHealth = 100;
                }
                if (initialHealth < 100) {
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                } else if (initialHealth == 100) {
                    System.out.printf("You healed for %d hp.%n", 100 - currentHealth);
                    System.out.printf("Current health: %d hp.%n", initialHealth);

                }
            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);

            } else {
                initialHealth -= number;
                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.%n", command);

                } else if (initialHealth <= 0) {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i + 1);
                    isNotDead = false;
                    break;
                }

            }
        }
        if (isNotDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", initialHealth);
        }
    }
}
