package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagon = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(scanner.nextLine());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")) {
            String[] command = lineInput.split(" ");
            String firstWord = command[0];

            if (firstWord.equals("Add")) {
                int number = Integer.parseInt(command[1]);
                wagon.add(number);
            } else {
                int countPeople = Integer.parseInt(firstWord);
                for (int i = 0; i < wagon.size(); i++) {
                    int currentWagon = wagon.get(i);
                    if ((currentWagon + countPeople) <= wagonCapacity) {
                        wagon.set(i, currentWagon + countPeople);
                        break;
                    }
                }
            }
            lineInput = scanner.nextLine();
        }

        System.out.println(wagon.toString().replaceAll("[\\[\\],]", ""));
    }
}
