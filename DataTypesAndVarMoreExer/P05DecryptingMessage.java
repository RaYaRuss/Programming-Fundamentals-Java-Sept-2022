package dataType.moreExer;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        String message = "";
        int code = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            char symbol = scanner.nextLine().charAt(0);

            code = (int)symbol + key;
            message = message + (char)code;

        }
        System.out.println(message);
        }
    }



