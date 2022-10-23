package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")) {
            String[] commandArr = lineInput.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(commandArr[1]);
                    if (numsList.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = commandArr[1];
                    if (evenOrOdd.equals("even")) {
                        List<Integer> newEvenList = new ArrayList<>();
                        for (int i = 0; i < numsList.size(); i++) {
                            if (numsList.get(i) % 2 == 0) {
                                newEvenList.add(numsList.get(i));
                            }
                        }
                        for (int j = 0; j < newEvenList.size(); j++) {
                            System.out.print(newEvenList.get(j) + " ");
                        }
                        System.out.println();
                    } else if (evenOrOdd.equals("odd")) {
                        List<Integer> newEvenList = new ArrayList<>();
                        for (int i = 0; i < numsList.size(); i++) {
                            if (numsList.get(i) % 2 != 0) {
                                newEvenList.add(numsList.get(i));
                            }
                        }
                        for (int el : newEvenList) {
                            System.out.print(el + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numsList.size(); i++) {
                        sum = sum + numsList.get(i);
                    }
                    System.out.println(sum);

                    break;
                case "Filter":
                    List<Integer> filterList = new ArrayList<>();
                    int conditionNumber = Integer.parseInt(commandArr[2]);
                    switch (commandArr[1]) {
                        case "<":
                            for (int i = 0; i < numsList.size(); i++) {
                                if (numsList.get(i) < conditionNumber) {
                                    filterList.add(numsList.get(i));
                                }
                            }
                            System.out.println(filterList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                        case ">":
                            for (int i = 0; i < numsList.size(); i++) {
                                if (numsList.get(i) > conditionNumber) {
                                    filterList.add(numsList.get(i));
                                }
                            }
                            System.out.println(filterList.toString().replaceAll("[\\[\\],]", ""));

                            break;
                        case ">=":
                            for (int i = 0; i < numsList.size(); i++) {
                                if (numsList.get(i) >= conditionNumber) {
                                    filterList.add(numsList.get(i));
                                }
                            }
                            System.out.println(filterList.toString().replaceAll("[\\[\\],]", ""));

                            break;
                        case "<=":
                            for (int i = 0; i < numsList.size(); i++) {
                                if (numsList.get(i) <= conditionNumber) {
                                    filterList.add(numsList.get(i));
                                }
                            }
                            System.out.println(filterList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                    }


            }
            lineInput = scanner.nextLine();
        }
    }

}