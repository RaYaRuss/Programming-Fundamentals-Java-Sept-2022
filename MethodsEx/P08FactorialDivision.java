package MethodsEx;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long fact1 = calculateFactorial(number1);// факториела на първото число

        long fact2 = calculateFactorial(number2);// факториела на второто число

        //делим факт на първото число с фаториела на второто число
        double divisionResult = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", divisionResult);
    }

    // да си напишем метод, който намира факториела (long always)на дадено число и ми го връща;
    public static long calculateFactorial (long number) {
        long fact = 1; // стойността на фактуриела
        for (int i = 1; i <= number; i++) {
            fact =  fact * i;
        }
        return fact;
    }
}
