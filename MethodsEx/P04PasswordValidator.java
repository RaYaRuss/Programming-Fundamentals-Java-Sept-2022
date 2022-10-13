package MethodsEx;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isPasswordlengthValid = checkLength(password);

        if (!isPasswordlengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidConsistingLettersDiggits = consistLetterDigits(password);

        if (!isValidConsistingLettersDiggits) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidWith2Diggits = hasAtLeaseTwoDigits(password);

        if (!isValidWith2Diggits) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isPasswordlengthValid && isValidConsistingLettersDiggits && isValidWith2Diggits) {
            System.out.println("Password is valid");
        }
    }

    public static boolean checkLength(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            return false;

        }
    }

    public static boolean consistLetterDigits(String pass) {
        char[] chars = new char[pass.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = pass.charAt(i);
            if (!Character.isLetterOrDigit(chars[i])) {
                return false;
            }

            }
        return true;
        }

    public static boolean hasAtLeaseTwoDigits(String pass) {
        int countDigits = 0;
        char[] chars = new char[pass.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = pass.charAt(i);
            if (chars[i] >= '0' && chars[i] <= '9') {
                countDigits++;
            }
        }
        if (countDigits < 2) {
            return false;
        }
        return true;
    }
}

