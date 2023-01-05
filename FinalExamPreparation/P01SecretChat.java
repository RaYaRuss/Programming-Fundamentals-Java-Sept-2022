package FinalExamPreparation;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String instructions = scanner.nextLine();
        StringBuilder newMessage = new StringBuilder(message);

        while (!instructions.equals("Reveal")) {
            String [] instruction = instructions.split(":\\|:");
            String command = instruction[0];

            if (command.equals("InsertSpace")) {
                int index = Integer.parseInt(instruction[1]);
                newMessage.insert(index, " ");
                System.out.println(newMessage.toString());

            } else if (command.equals("Reverse")) {
                String substring = instruction[1];

                if (newMessage.toString().contains(substring)) {
                for (int i = 0; i < newMessage.length(); i++) {

                    int startIndex = newMessage.indexOf(substring);
                    int endIndex = startIndex + substring.length();
                    newMessage.replace(startIndex, endIndex , "");
                    for (int j = substring.length() - 1; j >= 0; j--) {
                        char current = substring.charAt(j);
                        newMessage.append(current);
                    }
                    System.out.println(newMessage.toString());
                    break;
                    }
                } else {
                    System.out.println("error");
                }
            } else if (command.equals("ChangeAll")) {
                String substring = instruction[1];
                String replacement = instruction[2];

                for (int i = 0; i < newMessage.length(); i++) {
                    if (newMessage.toString().contains(substring)) {
                        int startIndex = newMessage.indexOf(substring);
                        int endIndex = startIndex + substring.length();
                        newMessage.replace(startIndex, endIndex, replacement);
                    }
                }
                System.out.println(newMessage.toString());

            }
            instructions = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", newMessage);
    }
}
