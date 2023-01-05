package FinalExamPreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> carMileage = new LinkedHashMap<>();
        Map<String, Integer> carFuel = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String inputCars = scanner.nextLine();
            String carName = inputCars.split("\\|")[0];
            int mileage = Integer.parseInt(inputCars.split("\\|")[1]);
            int fuel = Integer.parseInt(inputCars.split("\\|")[2]);

            carMileage.put(carName, mileage);
            carFuel.put(carName, fuel);
        }

        String commandsLine = scanner.nextLine();
        while (!commandsLine.equals("Stop")) {

            String command = commandsLine.split(" : ")[0];
            String car = commandsLine.split(" : ")[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(commandsLine.split(" : ")[2]);
                    int fuel = Integer.parseInt(commandsLine.split(" : ")[3]);

                    if (carFuel.get(car) < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carMileage.put(car, carMileage.get(car) + distance);
                        carFuel.put(car, carFuel.get(car) - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    }
                    if (carMileage.get(car) >= 100000) {
                        carMileage.remove(car);
                        carFuel.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                    break;
                case "Refuel":
                    int fuelToRefuel = Integer.parseInt(commandsLine.split(" : ")[2]);
                    int currentFuel = carFuel.get(car);
                    if (currentFuel > 75 - fuelToRefuel) {
                        carFuel.put(car, 75);
                        fuelToRefuel = 75 - currentFuel;
                    } else {
                        carFuel.put(car, carFuel.get(car) + fuelToRefuel);
                    }
                    System.out.printf("%s refueled with %d liters%n", car, fuelToRefuel);

                    break;
                case "Revert":
                    int kms = Integer.parseInt(commandsLine.split(" : ")[2]);
                    carMileage.put(car, carMileage.get(car) - kms);
                    if (carMileage.get(car) < 10000) {
                        carMileage.put(car, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n",car, kms );
                    }
                    break;
            }
            commandsLine = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : carMileage.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue(), carFuel.get(entry.getKey()));
        }
    }
}
