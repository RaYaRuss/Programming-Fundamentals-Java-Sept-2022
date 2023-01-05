package FinalExamPreparation;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        String instructions = scanner.nextLine();

        StringBuilder decryptedMessage = new StringBuilder();
        decryptedMessage.append(encryptedMessage);
        while (!instructions.equals("Decode")) {

            if (instructions.contains("Move")) {
                int numberOfLetters = Integer.parseInt(instructions.split("\\|")[1]);
                String firstNLetters = decryptedMessage.substring(0, numberOfLetters);
                decryptedMessage.append(firstNLetters);
                decryptedMessage.delete(0, numberOfLetters);

            } else if (instructions.contains("Insert")) {
                int index = Integer.parseInt(instructions.split("\\|")[1]);
                String value = instructions.split("\\|")[2];
                decryptedMessage.insert(index, value);

            } else if (instructions.contains("ChangeAll")) {
                String substring = instructions.split("\\|")[1];
                String replacement = instructions.split("\\|")[2];
                for (int i = 0; i < decryptedMessage.length(); i++) {
                    String current = decryptedMessage.substring(i, i + 1);
                    if (current.equals(substring)) {
                        decryptedMessage.replace(i, i + 1, replacement);
                    }
                }

            }
            instructions = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", decryptedMessage.toString());

    }
}
