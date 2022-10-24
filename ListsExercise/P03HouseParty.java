package ListsExercise;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());

        List<String> guestsNames = new ArrayList<>();

        for (int i = 1; i <= countCommands; i++) {
            String command = scanner.nextLine();
            List<String> commandParts = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());
            String name = commandParts.get(0);

            if (commandParts.size() == 3) { // somebody is going
                if (guestsNames.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestsNames.add(name);
                }

            } else if (commandParts.size() == 4) { // somebody is not going
                if (guestsNames.contains(name)) {
                    guestsNames.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String el : guestsNames) {
            System.out.println(el);
        }
    }
}