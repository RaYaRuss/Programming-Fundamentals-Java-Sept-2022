package Arrays.exercise;

import java.util.Scanner;
import java.util.Arrays;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
                int magicSum = Integer.parseInt(scanner.nextLine());

                //взимам число от масива и обхождам всичко след него

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber =  numbers[index];
            //обхождам всички числа след него до последното
            for (int inIndex = index + 1; inIndex <= numbers.length - 1; inIndex++) {
                int inNumber =  numbers[inIndex];

                if (currentNumber + inNumber == magicSum) {
                    System.out.println(currentNumber + " " + inNumber);
                }
            }

        }
    }
}
