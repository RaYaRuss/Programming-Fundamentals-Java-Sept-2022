package Arrays.exercise;

import java.util.Scanner;
import java.util.Arrays;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotations; rotation++) {
            // взимаме първия елемент
            int firstElement = numbers[0];
            //преместваме всичко елементи с едно наляво
            //всички индекси от първия до предпоследния
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            //слагаме на последната позиция да е първият взет елемент
            numbers[numbers.length - 1] = firstElement;
        }
        //отпечатваме масива
        for (int number : numbers) {
            System.out.print(number + " ");

        }
    }
}
