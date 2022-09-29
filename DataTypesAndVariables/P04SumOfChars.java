package DataTypesAndVariables;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int count = 1; count <= countSymbols; count++) {
            char value = scanner.nextLine().charAt(0);
            int code = (int) value; // or sum += (int) value;
            sum += code;

        }
        System.out.printf("The sum equals: %d", sum);
    }
}
