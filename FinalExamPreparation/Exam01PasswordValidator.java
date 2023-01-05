package FinalExamPreparation;

import java.util.Scanner;

public class Exam01PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        StringBuilder sbPassword = new StringBuilder(password);

        String commandsLine = scanner.nextLine();

        while (!commandsLine.equals("Complete")) {
            String[] command = commandsLine.split("\\s+");
            if (commandsLine.contains("Upper")) {
                int index = Integer.parseInt(command[2]);
                char current = sbPassword.charAt(index);
//                sbPassword.toString().replace(current, Character.toUpperCase(current));
                sbPassword.insert(index, Character.toUpperCase(current));
                sbPassword.deleteCharAt(index + 1);

                System.out.println(sbPassword);

            } else if (commandsLine.contains("Lower")) {
                int index = Integer.parseInt(command[2]);
                char current = sbPassword.toString().charAt(index);
//                sbPassword.toString().replace(current, Character.toLowerCase(current));
                sbPassword.insert(index, Character.toLowerCase(current));
                sbPassword.deleteCharAt(index + 1);
                System.out.println(sbPassword);

            } else if (commandsLine.contains("Insert")) {
                int index = Integer.parseInt(command[1]);
                char charInsert = command[2].charAt(0);
                if (index >= 0 && index < password.length()) {
                    sbPassword.insert(index, charInsert);
                    System.out.println(sbPassword);
                }

            } else if (commandsLine.contains("Replace")) {
                char charToReplace = command[1].charAt(0);
                int value = Integer.parseInt(command[2]);
                int sum = 0;
                if (sbPassword.toString().contains(charToReplace + "")) {

                    sum = charToReplace + value;
                    char newSymbol = (char) sum;
                    for (int i = 0; i < sbPassword.length(); i++) {
                        char current = sbPassword.charAt(i);
                        if (current == charToReplace) {
                            sbPassword.insert(i, newSymbol);
                            sbPassword.deleteCharAt(i + 1);
                        }
                    }
                    System.out.println(sbPassword);

                }

            } else if (commandsLine.contains("Validation")) {
                if (sbPassword.length() < 8) {
                    System.out.println("Password must be at least 8 characters long!");
                }

                for (int i = 0; i < sbPassword.length(); i++) {
                    if (sbPassword.charAt(i) < 97 && sbPassword.charAt(i) > 122 &&
                            sbPassword.charAt(i) < 65 && sbPassword.charAt(i) > 90 &&
                            sbPassword.charAt(i) != '_') {
                        System.out.println("Password must consist only of letters, digits and _!");
                    }
                }
                boolean isUpper = false;
                for (int i = 0; i < sbPassword.length(); i++) {
                    if (sbPassword.charAt(i) >= 'A' && sbPassword.charAt(i) <= 'Z') {
                        isUpper = true;
                        break;
                    }
                }
                if (!isUpper){
                    System.out.println("Password must consist at least one uppercase letter!");
                }
                boolean isLowerCase = false;
                for (int i = 0; i < sbPassword.length(); i++) {
                    if (sbPassword.charAt(i) >= 'a' && sbPassword.charAt(i) <= 'z') {
                        isLowerCase = true;
                        break;
                    }
                }
                if (!isLowerCase) {
                    System.out.println("Password must consist at least one lowercase letter!");
                }
                boolean isDigit = false;
            for (int i = 0; i < sbPassword.length(); i++) {
                if (sbPassword.charAt(i) >= '0' && sbPassword.charAt(i) <= '9') {
                    isDigit = true;
                    break;
                }
            }
            if (!isDigit){
                System.out.println("Password must consist at least one digit!");
            }
        }
        commandsLine = scanner.nextLine();
    }
}
}

