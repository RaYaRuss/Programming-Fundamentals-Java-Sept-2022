package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. да имаме списък с числа от входните данни го получаваме
        //2. получаваме команди -> "end"

        List<Integer> numbers = Arrays.stream(scanner.nextLine() // " 1 2 3 4 5 5 5 6"
                .split( " "))// ["1", "2", "3", "4", "5", ....] -> масив от текстове
                .map(Integer::parseInt) // [1, 2, 3, 4, 5, 5, 5, 6] -> масив от цели числа
                .collect(Collectors.toList()); //{1, 2, 3, 4, 5, 5, 5, 6} -> списък от цели числа

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Delete")) { // премахваме всички стойности от списъка, които са равни на командата
                int numberForRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberForRemove)); // методът  remove all приема някакъв списък и го премахва, преобразуваме го в списък
           // само  remove(object) - премахва само първата срещната стойност

            } else if (command.contains("Insert")) {

                int element = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, element);
            }
            command = scanner.nextLine();
        }
        // получаваме списък с числа
        for ( int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
