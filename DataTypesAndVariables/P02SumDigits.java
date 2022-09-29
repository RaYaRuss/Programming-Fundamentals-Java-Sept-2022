package DataTypesAndVariables;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        System.out.println(sum);
        // or with: for (int number = Integer.parseInt(scanner.nextLine());; number >0; number = number /10) {

        }
    }

