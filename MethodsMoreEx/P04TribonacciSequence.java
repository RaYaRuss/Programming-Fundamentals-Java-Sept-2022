package MethodsMoreEx;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printSequence(num);

    }

    public static void printSequence(int num) {

        int[] numbers = new int[num];

        if (num == 1) {
            System.out.println(1);
        } else if (num == 2) {
            System.out.print(1 + " " + 1);
        } else if (num == 3) {
            System.out.print(1 + " " + 1 + " " + 2);
        } else if (num >= 4) {
            numbers[0] = 1;
            numbers[1] = 1;
            numbers[2] = 2;

            for (int i = 3; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2] + numbers[i - 3];
            }
            for (int element : numbers) {
                System.out.print(element + " ");
            }
        }
    }
}