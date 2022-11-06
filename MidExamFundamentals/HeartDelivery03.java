package MidExamFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] houses = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String jumpCommands = scanner.nextLine();
        int currentIndex = 0;

        while (!jumpCommands.equals("Love!")) {
            String [] command = jumpCommands.split(" ");
            int jumpLength = Integer.parseInt(command[1]);

            currentIndex = currentIndex + jumpLength;
                    if (currentIndex >= houses.length) {
                        currentIndex = 0;
                    }
                    if (houses[currentIndex] != 0) {
                        houses[currentIndex] = houses[currentIndex] - 2;
                        if (houses[currentIndex] == 0) {
                            System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                        }
                    } else {
                        System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
                    }
                    jumpCommands = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",  currentIndex);
        boolean isSuccessful = true;
        int countHousesDay = 0;
        for (int h : houses) {
            if (h != 0 ){
                countHousesDay++;
                isSuccessful = false;
            }
        }
        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", countHousesDay);
        }

    }
}
