package TextProcessingEx;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        String input = scanner.nextLine();
        String [] usernames = input.split(", ");

        //2.проверка дали данните са валидни
        for (String username : usernames) {
            // ако username е валиден
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }
    // метод, който проверява дали username е валиден
    // true - ако username е валиден
    // false - ако username не е валиден
    public static boolean isValidUsername(String username) {
        // 1. валидна дължина -> [3; 16]

        if (username.length() < 3 || username.length() > 16) {

            return false;
            //2. валидно съдържание -> букви, цифри, -, _;
        }
        for (char symbol : username.toCharArray()) { // правим го на чар арей, за да го обходим
            if(!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                // невалиден символ -> невалиден username
                return false;
            }
        }
        // всички символи са валидни, след като обходим цялата дума
        return true;
    }
}
