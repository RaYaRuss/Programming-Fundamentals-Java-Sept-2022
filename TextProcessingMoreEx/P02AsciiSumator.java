package TextProcessingMoreEx;

import java.util.Scanner;

public class P02AsciiSumator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();
        int firstIndex = (int) Math.min(first, second);
        int secondIndex = (int) Math.max(first, second);

        int sum = 0;

        for (int i = 0; i <= text.length() - 1; i++) {
            int current = (int)(text.charAt(i));

            if (current > firstIndex && current < secondIndex) {
                sum += current;
            }
        }
        System.out.println(sum);
    }
}

