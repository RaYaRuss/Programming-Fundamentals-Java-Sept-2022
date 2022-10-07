package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int leftSum = 0;
            int rightSum = 0;
            for (int leftIndex = 0; leftIndex < i; leftIndex++) {
                leftSum += array[leftIndex];
            }
            for (int rightIndex = i + 1; rightIndex < array.length; rightIndex++) {
                rightSum += array[rightIndex];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
