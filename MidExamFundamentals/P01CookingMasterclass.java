package MidExamFundamentals;

import java.util.Scanner;

public class P01CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double singleEggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        double tenEggsPrice = 10 * singleEggPrice;
        // one student -> 10 eggs , 1 apron, 1 pc flour;
        // aprons -> 20% more, rounded up to the next integer;
        // every fifth package of flour is free;

        double neededMoney = 0;

            int freeFlour = 0;
            if (studentsCount >= 5) {
                freeFlour =  studentsCount / 5;
            }
            neededMoney = (apronPrice * Math.ceil(studentsCount + studentsCount * 0.2) +
                    tenEggsPrice * studentsCount + flourPrice * (studentsCount - freeFlour));

            if (neededMoney <= budget) {
                System.out.printf("Items purchased for %.2f$.", neededMoney);
            } else {
                double diff =  Math.abs(neededMoney - budget);
                System.out.printf("%.2f$ more needed.", diff);
            }

    }
}
