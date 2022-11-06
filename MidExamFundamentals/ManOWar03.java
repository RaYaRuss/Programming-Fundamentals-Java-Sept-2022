package MidExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> warshipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int healthInput = Integer.parseInt(scanner.nextLine());
        String inputLine = scanner.nextLine();
        boolean enemySunk = false;
        boolean pirateShipSunk = false;

        while (!inputLine.equals("Retire")) {
            String[] commandLine = inputLine.split("\\s+");
            String command = commandLine[0];

            switch (command) {
                case "Fire":
                    int index = Integer.parseInt(commandLine[1]);
                    int damage = Integer.parseInt(commandLine[2]);
                    if (index >= 0 && index < warshipStatus.size()) {
                        warshipStatus.set(index, warshipStatus.get(index) - damage);
                        if (warshipStatus.get(index) <= 0) {
                            enemySunk = true;
                            break;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int endIndex = Integer.parseInt(commandLine[2]);
                    int defendDamage = Integer.parseInt(commandLine[3]);
                    if (startIndex >= 0 && endIndex < pirateShipStatus.size() && startIndex < endIndex) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShipStatus.set(i, pirateShipStatus.get(i) - defendDamage);
                            if (pirateShipStatus.get(i) <= 0) {
                                pirateShipSunk = true;
                                break;
                            }
                        }
                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(commandLine[1]);
                    int health = Integer.parseInt(commandLine[2]);
                    if (repairIndex >= 0 && repairIndex < pirateShipStatus.size()) {
                        pirateShipStatus.set(repairIndex, pirateShipStatus.get(repairIndex) + health);
                        if (pirateShipStatus.get(repairIndex) > healthInput) {
                            pirateShipStatus.set(repairIndex, healthInput);
                        }
                    }
                    break;
                case "Status":
                    int count = 0;
                    for (int section : pirateShipStatus) {
                        if (section < healthInput * 0.2) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);

                    break;
            }

            inputLine = scanner.nextLine();
        }
        if (enemySunk) {
            System.out.println("You won! The enemy ship has sunken.");
        } else if (pirateShipSunk) {
            System.out.println("You lost! The pirate ship has sunken.");
        } else {
            int pirateSum = 0;
            int warshipSum = 0;
            for (int sec : pirateShipStatus) {
                pirateSum += sec;
            }
            System.out.printf("Pirate ship status: %d%n", pirateSum);

            for (int sec : warshipStatus) {
                warshipSum += sec;
            }
            System.out.printf("Warship status: %d", warshipSum);
        }
    }
}