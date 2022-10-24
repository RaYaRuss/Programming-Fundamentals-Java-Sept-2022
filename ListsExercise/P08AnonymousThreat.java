package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    if (endIndex > list.size() - 1) {
                        endIndex = list.size() - 1;
                    }
                    if (startIndex < 0 || startIndex > list.size() - 1) {
                        startIndex = 0;
                    }

                    boolean isValidIndex = startIndex <= list.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                    if (isValidIndex) {
                        String resultMerge = "";
                        for (int i = startIndex; i <= endIndex; i++) {
                            String currentText = list.get(i);
                            resultMerge = resultMerge + currentText;
                        }
                        for (int i = startIndex; i <= endIndex; i++) {
                            list.remove(startIndex);
                        }
                        list.add(startIndex, resultMerge);
                    }
                        break;

                case "divide":
                    int index = Integer.parseInt(command[1]);
                    int partitions = Integer.parseInt(command[2]);
                    String elementToDivide = list.get(index);
                    list.remove(index);
                    int partElements = elementToDivide.length() / partitions;

                    int beginIndexOfText = 0;
                    for (int i = 1; i < partitions; i++) {
                        list.add(index,elementToDivide.substring(beginIndexOfText, beginIndexOfText + partElements));
                        index++;
                        beginIndexOfText += partElements;
                    }
                    list.add(index, elementToDivide.substring(beginIndexOfText));
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", list));
    }
}
