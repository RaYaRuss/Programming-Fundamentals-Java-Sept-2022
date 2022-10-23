package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")) {
            String [] commandArr = lineInput.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(Integer.valueOf(numToRemove)); // zashtoto tuk e referentniya tip danni, chete go kato element, obekt
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(indexRemove); // primitivniq tip danni
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandArr[1]);
                    int indexToInsert = Integer.parseInt(commandArr[2]);
                    numbersList.add(indexToInsert, numberToInsert);
                    break;
            }
            lineInput = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        // ili si printirame directno s for loop
    }
}
