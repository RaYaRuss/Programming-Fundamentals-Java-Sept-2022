package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        //повтарящо действие -> въвеждане на команди
        // стоп: команда == "end"
        //продължаваме: входни данни != "end"

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            // имаме валидка команда за изпълнение
            if (command.contains("swap")) { // дали в командата се съдържа думата swap
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                // взимам елемента на първия получен индекс
                int element1 = numbers[index1];
                //взимам елемента на втория получен индекс
                int element2 = numbers[index2];
                // правим размяната
                numbers[index1] = element2;
                numbers[index2] = element1;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                // взимам елемента на първия получен индекс
                int element1 = numbers[index1];
                //взимам елемента на втория получен индекс
                int element2 = numbers[index2];
                int product = element1 * element2;
                numbers[index1] = product;

            } else if (command.equals("decrease")) {
                //да обходим всички елементи и да ги намалим с 1;
                for (int index = 0; index <= numbers.length - 1; index++) {
                    numbers[index]--;
                    // numbers[index] -= 1;
                    //numbers[index] = numbers[index] - 1;
                }
            }
            command = scanner.nextLine();
        }
        //отпечатваме със ", "
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNum = numbers[index];
            if (index != numbers.length - 1) { // не сме на последното число
                System.out.print(currentNum + ", ");
            } else { // на последното число съм
                System.out.println(currentNum);
            }

        }
    }
}

