package Methodslab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int countInput = Integer.parseInt(scanner.nextLine());

        switch (productInput) {
            case "coffee":
                getTotalPrice(countInput, 1.5 );
                break;
            case "water":
                getTotalPrice(countInput, 1.00);
                break;
            case "coke":
                getTotalPrice(countInput, 1.40);
                break;
            case "snacks":
                getTotalPrice(countInput, 2.00);
                break;
        }
    }

    public static void getTotalPrice (int count, double price) {
        double totalPrice = 0;
        totalPrice = count * price;
        System.out.printf("%.2f", totalPrice);
    }
}
