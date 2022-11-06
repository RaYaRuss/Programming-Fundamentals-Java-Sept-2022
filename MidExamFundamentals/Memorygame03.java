package MidExamFundamentals;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Memorygame03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        int countInput = 0;
        boolean isEmpty = false;

        while (!inputLine.equals("end")) {
            countInput++;
            String[] input = inputLine.split(" ");
            int firstIndex = Integer.parseInt(input[0]);
            int secondIndex = Integer.parseInt(input[1]);

            if (firstIndex == secondIndex || firstIndex < 0 || firstIndex >= elements.size()
                    || secondIndex < 0 || secondIndex >= elements.size()) {
                elements.add(elements.size() / 2, (- countInput) + "a");
                elements.add(elements.size() / 2, (- countInput) + "a");
                System.out.println("Invalid input! Adding additional elements to the board");

            } else if ( elements.get(firstIndex).equals(elements.get(secondIndex))) {
                String a = elements.get(firstIndex);
                String b = elements.get(secondIndex);
                elements.remove(a);
                elements.remove(b);
                System.out.printf("Congrats! You have found matching elements - %s!%n", a);
                if (elements.isEmpty()) {
                    isEmpty = true;
                    break;
                }
            } else {
                System.out.println("Try again!");
            }


            inputLine = scanner.nextLine();
        }
        if (isEmpty) {
            System.out.printf("You have won in %d turns!%n", countInput);
        } else {
            System.out.println("Sorry you lose :(");
            for (String el : elements) {
                System.out.print(el + " ");
            }
        }
    }
}
