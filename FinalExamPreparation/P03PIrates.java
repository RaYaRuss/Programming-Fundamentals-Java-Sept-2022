package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03PIrates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> townPopulation = new LinkedHashMap<>();
        Map<String, Integer> townGold = new LinkedHashMap<>();

        while (!input.equals("Sail")) {
            String town =  input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);

            if (townPopulation.containsKey(town)) {
                townPopulation.put(town, townPopulation.get(town) + population);
            } else {
                townPopulation.put(town, population);
            }
            if (townGold.containsKey(town)) {
                townGold.put(town, townGold.get(town) + gold);
            } else {
                townGold.put(town, gold);
            }
            input = scanner.nextLine();
        }

        String events = scanner.nextLine();
        while (!events.equals("End")) {
            String command = events.split("=>")[0];
            String town = events.split("=>")[1];

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(events.split("=>")[2]);
                    int gold = Integer.parseInt(events.split("=>")[3]);
                    townGold.put(town, townGold.get(town) - gold);
                    townPopulation.put(town, townPopulation.get(town) - people);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    if ((townPopulation.get(town) <= 0) || (townGold.get(town) <= 0 )) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        townPopulation.remove(town);
                        townGold.remove(town);
                    }
                    break;
                case "Prosper":
                    int goldProsper = Integer.parseInt(events.split("=>")[2]);
                    if (goldProsper < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        townGold.put(town, townGold.get(town) + goldProsper);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n" ,
                                goldProsper, town, townGold.get(town) );
                    }
                    break;
            }
            events = scanner.nextLine();
        }
        if (townGold.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", townGold.size());
            for (Map.Entry<String, Integer> entry : townGold.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(),
                        townPopulation.get(entry.getKey()), entry.getValue());
            }

        }

    }
}
