package DataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int countLines = Integer.parseInt(scanner.nextLine());

            int sum = 0;

        for (int i = 1; i <= countLines; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            sum +=litersOfWater;

            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum = sum - litersOfWater;
                continue;


            }
        }
        System.out.println(sum);

    }
}
