package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSym = scanner.nextLine().charAt(0);
        char secondSym = scanner.nextLine().charAt(0);
        char thirdSym = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", firstSym, secondSym, thirdSym);
    }
}
