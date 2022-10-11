package Methodslab;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(numberInput));
    }

    public static int getMultipleOfEvensAndOdds (int n){
        int evenSum = getSumOfEvenDigits(n);
        int oddsSum =  getSumOfOddDigits(n);

        return evenSum * oddsSum;
    }

    public static int getSumOfEvenDigits(int n){
        int evenSum = 0;

        String intToString = Integer.toString(n);

        int[] arr = Arrays.stream(intToString.split(""))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
        }
        return evenSum;
    }

    public static int getSumOfOddDigits(int n) {
        int oddSum = 0;

        String intToString = Integer.toString(n);

        int[] arr = Arrays.stream(intToString.split(""))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddSum += arr[i];
            }
        }

        return oddSum;
    }
}
