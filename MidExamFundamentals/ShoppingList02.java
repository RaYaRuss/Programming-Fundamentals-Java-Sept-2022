package MidExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());;

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Go Shopping!")) {
            String[] commandLine = inputLine.split(" ");
            String command = commandLine[0];
            String item = commandLine[1];

            switch (command) {
                case "Urgent":
                    if (initialList.contains("item")) {
                        continue;
                    } else if (!initialList.contains("item")) {
                        initialList.add(0,item);
                    }
                    break;
                case "Unnecessary":

                    if (!initialList.contains(item)) {
                        initialList.remove(item);
                    }
                    break;
                case "Correct":

                    String newItem = commandLine[2];
                    if (initialList.contains(item)) {
                        initialList.set(initialList.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange":

                    if (initialList.contains(item)) {
                        initialList.remove(item);
                        initialList.add(item);
                    }
                    break;
            }

            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(", ", initialList));
    }
}
