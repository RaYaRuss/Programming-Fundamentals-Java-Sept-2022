package ListsLab;

import java.util.Scanner;

public class BlackFlag01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double currentPlunder = 0;

        for (int i = 1; i <= days; i++) {
            currentPlunder += dailyPlunder;
            if (i % 3 == 0) {
                currentPlunder += dailyPlunder * 1.0 / 2;
            }
            if (i % 5 == 0) {
                currentPlunder = currentPlunder * 0.7;
            }
        }
        if (currentPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", currentPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder." , (currentPlunder / expectedPlunder) * 100);
        }
    }
}
