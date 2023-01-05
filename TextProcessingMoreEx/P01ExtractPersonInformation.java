package TextProcessingMoreEx;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String name = " ";
            String age = " ";
            int index1 = input.indexOf('@');
            int index2 = input.indexOf('|');
            int index3 = input.indexOf('#');
            int index4 = input.indexOf('*');
            name = input.substring(index1 + 1, index2);
            age = input.substring(index3 + 1, index4);

            System.out.printf("%s is %s years old.%n", name, age);

        }
    }
}
