package DataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int countDay = 0;
        int totalYield = 0;
        int total = 0;

        while ( yield >= 100) {
            if (yield >= 26) {
                totalYield = yield - 26;
            }
             countDay++;
             yield = yield - 10;
             total += totalYield;
        }
        if (total >= 26) {
            total = total - 26;
        }
        System.out.println(countDay);
        System.out.println(total);
    }
}
