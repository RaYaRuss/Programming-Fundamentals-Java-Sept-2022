package ListsMoreEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        double timeLeftNeeded = 0;
        double timeRightNeeded = 0;
        for (int i = 0; i < numbers.size() / 2; i++) {
            if (numbers.get(i) == 0) {
                timeLeftNeeded = timeLeftNeeded * 0.8;
            } else {
                timeLeftNeeded += numbers.get(i);
            }
        }
        for (int i = numbers.size() - 1; i >= (numbers.size() / 2) + 1; i--) {
            if (numbers.get(i) == 0) {
                timeRightNeeded = timeRightNeeded * 0.8;
            } else {
                timeRightNeeded += numbers.get(i);
            }
        }
        if (timeLeftNeeded <= timeRightNeeded) {
            System.out.printf("The winner is left with total time: %.1f", timeLeftNeeded);
        } else if (timeRightNeeded < timeLeftNeeded){
            System.out.printf("The winner is right with total time: %.1f", timeRightNeeded);
        }
    }
}