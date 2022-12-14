package MethodsEx;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (!number.equals("END")) {
            if (!isPalindrome(number)) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
            number = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String num) {
        String reversedString = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reversedString += num.charAt(i);
        }
        return num.equals(reversedString);

    }
}
