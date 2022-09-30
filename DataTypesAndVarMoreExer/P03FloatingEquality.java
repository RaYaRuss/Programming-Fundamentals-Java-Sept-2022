package dataType.moreExer;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        if ((num1 - num2) > 0.000001 || (num2 - num1) > 0.000001) {
            System.out.println("False");
        } else if (num1 - num2 == 0.000001 || num2 - num1 == 0.000001) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
