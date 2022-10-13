package MethodsEx;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            //проверка дали е топ число:
            //1. сумата от цифрите му да се дели на 8;
            //2. да съдържа поне една нечетна цифра;

            if (isSumOfDigitsDivisibleBy8(number) && isContainsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }
    // метод, който проверява дали сумата от цифрите се дали на 8
    //искаме методът да връща true, ако сумата се дели на 8 и false - ако сумата не се дели на 8;

    public static boolean isSumOfDigitsDivisibleBy8 (int number) {
        //1. да намерим сума от цифрите
        int sumDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number = number / 10;
        }
        //2. да направим проверка на сумата дали се дели на 8
        return sumDigits % 8 == 0; // този израз е булев израз, защото има оператора ==; връща true or false;
        /*if (sumDigits % 8 == 0) {
            return true;
        } else {
            return false;
        } */

    }
    // метод - проверява дали имаме поне една нечетна цифра в числото;
    // да връща true - ако имаме поне една нечетна цифра и връща false ако няма нито една незетна цифра;
     public static boolean isContainsOddDigit (int number) {
        // обхожда всяка цифра в числото -> проверка дали е нечетна
         while (number > 0) {
             //взимам последната цифра, проверявам дали е нечетна, премахвам цифрата;
             int lastDigit = number % 10;
             if (lastDigit % 2 != 0) {
                 return true;
             } else { // цифрата да е четна -> премахвам я
                 number = number / 10;
             }
         }
         // взели сме всички цифри и никоя не е била нечетна, всички са били четни;
         return false;
     }
}
