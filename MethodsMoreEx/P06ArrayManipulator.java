package MethodsMoreEx;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

public class P06ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            String firstWord = command[0];
            String secondWord = command[1];
            switch (firstWord) {
                case "exchange":
                    nums = exchangeIndex(nums, Integer.parseInt(secondWord));
                    break;
                case "max":
                    if (secondWord.equals("even")) {
                        printMaxEven(nums);
                    } else if (secondWord.equals("odd")) {
                        printMaxOdd(nums);
                    }
                    break;
                case "min":
                    if (secondWord.equals("even")) {
                        printMinEven(nums);
                    } else if (secondWord.equals("odd")) {
                        printMinOdd(nums);
                    }
                    break;
                case "first":
                    int countFirst = Integer.parseInt(secondWord);
                    if (command[2].equals("even")) {

                    } else if (command[2].equals("odd")) {

                    }

                    break;
                case "last":
                    break;
                default:
                    break;
            }
        }
    }

    public static int[] exchangeIndex(int[] array, int index) {
        int[] newArr = new int[array.length];
        int counter = 0;
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return array;
        } else {
            for (int i = index + 1; i < newArr.length; i++) {
                newArr[counter++] = array[i];
            }
            for (int i = 0; i <= index; i++) {
                newArr[counter++] = array[i];
            }
            array = newArr;
        }
        return array;

    }

    public static void printMaxEven(int[] array) {
        int maxEvenNum = Integer.MIN_VALUE;
        int currentIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= maxEvenNum) {
                maxEvenNum = array[i];
                currentIndex = i;
            }
        }
        if (currentIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(currentIndex);
        }
    }

    public static void printMaxOdd(int[] array) {
        int maxOddNum = 0;
        int currentIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] >= maxOddNum) {
                maxOddNum = array[i];
                currentIndex = i;
            }
        }
        if (currentIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(currentIndex);
        }
    }

    public static void printMinEven(int[] array) {
        int minEvenNum = Integer.MAX_VALUE;
        int currentIndex = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0 && array[i] < minEvenNum) {
                minEvenNum = array[i];
                currentIndex = i;
            }
        }
        if (currentIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(currentIndex);
        }
    }

    public static void printMinOdd(int[] array) {
        int minOddNum = Integer.MAX_VALUE;
        int currentIndex = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0 && array[i] < minOddNum) {
                minOddNum = array[i];
                currentIndex = i;
            }
        }
        if (currentIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(currentIndex);
        }
    }

    public static void printFirstEvenEl(int[] array, int count) {
        if (count < 0 || count > array.length) {
            System.out.println("Invalid count");
            return;
        }
        int index = 0;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[index++] = array[i];
                if (index == count) {
                    break;
                } else if (index < count) {
                    System.out.println(result[index]);
                }
            }
        }
        if (index == 0) {
            System.out.println("[]");
        } else {

        }
    }
}
