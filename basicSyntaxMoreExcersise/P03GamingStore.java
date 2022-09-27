package basicSyntaxMoreExcersise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double balance = currentBalance;
        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {
            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                break;
            } else {
                switch (input) {
                    case "OutFall 4":
                        if (currentBalance >= 39.99) {
                            currentBalance -= 39.99;
                            System.out.printf("Bought %s%n", input);
                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "CS: OG":
                        if (currentBalance >= 15.99) {
                            currentBalance -= 15.99;
                            System.out.printf("Bought %s%n", input);
                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "Zplinter Zell":
                        if (currentBalance >= 19.99) {
                            currentBalance -= 19.99;
                            System.out.printf("Bought %s%n", input);
                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "Honored 2":
                        if (currentBalance >= 59.99) {
                            currentBalance -= 59.99;
                            System.out.printf("Bought %s%n", input);
                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "RoverWatch":
                        if (currentBalance >= 29.99) {
                            currentBalance -= 29.99;
                            System.out.printf("Bought %s%n", input);
                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "RoverWatch Origins Edition":
                        if (currentBalance >= 39.99) {
                            currentBalance -= 39.99;
                            System.out.printf("Bought %s%n", input);
                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    default:
                        System.out.println("Not Found");
                        break;
                }
                input = scanner.nextLine();
            }
        }
        if (currentBalance <= 0) {
            System.out.println("Out of money");
        } else if (currentBalance < balance) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f" , balance - currentBalance, currentBalance);
            }
        }
    }
