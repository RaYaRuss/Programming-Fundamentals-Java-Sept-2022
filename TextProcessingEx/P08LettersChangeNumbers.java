package TextProcessingEx;

import javax.swing.*;
import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] codes = input.split("\\s+");

        double totalSum = 0; // сумата от модифицираните числа от всеки код
        for (String code : codes) {
            // код: {буква}{число{буква}
             // модифицирам си числото в кода спрямо буквите
            double modifiedNumber = getModifiedNumber(code);
            // добавям модифицираното зисло към сумата
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);
    }
    // метод, който връща модифицираното число от кода
    private static double getModifiedNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ')
                .replace(secondLetter, ' ')
                .trim()); // trim изрязва всички празни интервали;

        // проверка за first letter - главна или малка
        if (Character.isUpperCase(firstLetter)) {
            // главна буква -> ascii code e [65; 90]
            int positionUpperLetter = (int) firstLetter - 64;
            number = number / positionUpperLetter;

        } else { //малка буква -> ascii code [97; 120]
            int positionLowerLetter = (int) firstLetter - 96;
            number = number * positionLowerLetter;
    }
        // проверка за secondLetter -> главна или малка
        if (Character.isUpperCase(secondLetter)) {
            // главна буква -> ascii code e [65; 90]
            int positionUpperLetter = (int) secondLetter - 64;
            number = number - positionUpperLetter;

        } else { //малка буква -> ascii code [97; 120]
            int positionLowerLetter = (int) secondLetter - 96;
            number = number + positionLowerLetter;
        }
        return number;
}
}
