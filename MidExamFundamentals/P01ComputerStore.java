package MidExamFundamentals;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        boolean isSpecial = false;
        boolean isRegular = false;
        boolean isValid = true;

        while (!input.equals("spacial") || !input.equals("regular")) {
            if (input.equals("special")) {
                isSpecial = true;
                break;
            } else if (input.equals("regular")) {
                isRegular = true;
                break;
            } else {
                double partsPrice = Double.parseDouble(input);
                if (partsPrice < 0) {
                    System.out.println("Invalid price!");

                } else {
                    sum = sum + partsPrice;
                }
            }

            input = scanner.nextLine();
        }

        double taxes = sum * 0.2;
        double totalPrice = 0;

        if (isSpecial) {
            totalPrice = (sum + taxes) * 0.9;
        } else if (isRegular) {
            totalPrice = sum + taxes;
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", totalPrice);

        }
    }
}