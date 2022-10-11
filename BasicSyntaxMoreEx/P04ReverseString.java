package basicSyntaxMoreExcersise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output = "";

        for (int i = input.length() - 1 ; i >= 0; i--) {
            char currentSymbol = input.charAt(i);
            output += currentSymbol;
        }
        System.out.print(output);
    }
}
