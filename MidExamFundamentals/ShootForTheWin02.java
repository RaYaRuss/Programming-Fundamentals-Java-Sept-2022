package MidExamFundamentals;

import java.util.Scanner;
import java.util.Arrays;

public class ShootForTheWin02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String inputLine = scanner.nextLine();
        int countShotTargets = 0;

        while (!inputLine.equals("End")) {
            int index = Integer.parseInt(inputLine);
            if (index >= 0 && index < targets.length) {
                int currentValue = targets[index];
                targets[index] = -1;
                countShotTargets++;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] != -1 && targets[i] > currentValue) {
                            targets[i] -= currentValue;
                    } else if (targets[i] != -1 && targets[i] <= currentValue) {
                        targets[i] += currentValue;
                    }
                }
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", countShotTargets);
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}
