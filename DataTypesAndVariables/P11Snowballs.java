package DataTypesAndVariables;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0;
        double maxSnowballValue = Double.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxsnowballTime = 0;
        int maxsnowballQuality = 0;

        for (int ball = 1; ball <= numberOfSnowballs; ball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = Math.pow(snowballSnow * 1.0 / snowballTime, snowballQuality);
            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxsnowballQuality = snowballQuality;
                maxsnowballTime = snowballTime;
            }
        }
            System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow,
                    maxsnowballTime, maxSnowballValue, maxsnowballQuality);

    }
}
