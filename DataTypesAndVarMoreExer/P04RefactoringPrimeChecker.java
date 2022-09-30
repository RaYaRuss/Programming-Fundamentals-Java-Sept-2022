package dataType.moreExer;

import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            count = 0;
            for (int divider = 2; divider <= number; divider++) {
                if (i % divider == 0) {
                    count++;
                    if (count == 2) {
                        isPrime = false;
                        break;
                    }
                }

            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}