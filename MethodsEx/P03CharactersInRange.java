package MethodsEx;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printCharactersInRange(symbol1, symbol2);
    }

    public static void printCharactersInRange(char symbol1, char symbol2) {
        //правим проверка кой е по-малкият символ и започваме от него;
        if (symbol1 < symbol2) { //започваме от symbol1
            for (int symbol = (char) (symbol1 + 1); symbol < symbol2; symbol++) {
                System.out.print((char)(symbol) + " ");
            }

        } else { // започваме от symbol2
            for (int symbol = (char) (symbol2 + 1); symbol < symbol1; symbol++) {
                System.out.print((char)(symbol) + " ");
            }

        }
    }
}