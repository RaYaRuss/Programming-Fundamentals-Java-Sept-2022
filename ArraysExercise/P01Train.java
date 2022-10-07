package Arrays.exercise;

import java.util.Scanner;
import java.util.Arrays;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int [] array = new int[countWagons];

        for (int i = 0; i < countWagons; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            array [i] = people;
        }
        for (int number : array) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
