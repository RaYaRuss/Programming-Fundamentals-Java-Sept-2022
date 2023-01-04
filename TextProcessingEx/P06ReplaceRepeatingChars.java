package TextProcessingEx;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder text1 = new StringBuilder();


        for (int i = 0; i < text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            char nextSymbol = text.charAt(i + 1);

            if (currentSymbol != nextSymbol) {
            text1.append(currentSymbol);

            }

        }
         text1.append(text.charAt(text.length() - 1));
        System.out.println(text1);
    }
}
