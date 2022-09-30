package dataType.moreExer;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int countOpen = 0;
        int countClose = 0;
        char prevSymbol = ' ';
        boolean flag = false;
        char prevOpening = ' ';

        for (int i = 1; i <= numberOfLines; i++) {
            char symbol = scanner.nextLine().charAt(0);
            if ((int)symbol == (int)prevSymbol) {
                flag = true;
            }

            if ((int) symbol == 40) {
                countOpen++;
                prevSymbol = symbol;

            } else if ((int) symbol == 41) {
                countClose++;
                prevSymbol = symbol;
            }
        }
        if ((countClose - countOpen != 0) || (flag)) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}