package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 0;
        boolean isTrue = false;
        for (int i = 1; i <= totalCount; i++) {
            number = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isTrue = (number == 5) || (number == 7) || (number == 11);
            System.out.printf("%d -> %b%n", number, isTrue);
            sum = 0;
            i = number;
        }

    }
}