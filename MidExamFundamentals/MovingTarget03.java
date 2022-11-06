package MidExamFundamentals;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class MovingTarget03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("End")) {
            String[] commandLine = inputLine.split("\\s+");
            String command = commandLine[0];
            int index = Integer.parseInt(commandLine[1]);

            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(commandLine[2]);
                    if (index >= 0 && index <= targetsList.size() - 1) {
                        targetsList.set(index, targetsList.get(index) - power);
                        if (targetsList.get(index) <= 0) {
                            targetsList.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(commandLine[2]);
                    if (index >= 0 && index <= targetsList.size() - 1) {
                        targetsList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(commandLine[2]);
                    int startIndex = index - radius;
                    int endIndex = index + radius;
                    if (startIndex >= 0 && endIndex < targetsList.size()) {
                        targetsList.subList(startIndex, endIndex + 1).clear();
                    } else {
                        System.out.println("Strike missed!");

                    }
                    break;
            }

            inputLine = scanner.nextLine();
        }
        for (int target : targetsList) {
            if (target == targetsList.get(targetsList.size() - 1)) {
                System.out.print(target);
            } else {
                System.out.print(target + "|");
            }
        }
    }
}  // 90/100 in judge

       /* List<Integer> arr = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input;

        while (!"End".equals(input = scanner.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Shoot":
                    int shotIndex = Integer.parseInt(command[1]);
                    if (shotIndex < arr.size() && shotIndex >= 0) {
                        arr.set(shotIndex, arr.get(shotIndex) - Integer.parseInt(command[2]));
                        if (arr.get(shotIndex) <= 0) {
                            arr.remove(shotIndex);
                        }
                    }
                    break;
                case "Add":
                    int indexToAdd = Integer.parseInt(command[1]);
                    if (indexToAdd < arr.size() && indexToAdd >= 0) {
                        arr.add(indexToAdd, Integer.parseInt(command[2]));
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int index = Integer.parseInt(command[1]);
                    int radius = Integer.parseInt(command[2]);
                    if (index + radius < arr.size() && index - radius >= 0) {
                        arr.subList(index - radius, index + radius + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
        }
        System.out.print(Arrays.toString(new List[]{arr}).replaceAll("[\\[\\]]", "").replaceAll(", ", "|"));
    }
} */  // 100/ 100 in judge