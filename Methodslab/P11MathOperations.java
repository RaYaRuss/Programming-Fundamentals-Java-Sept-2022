package Methodslab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        //DecimalFormat df = new DecimalFormat("0.####");
        //System.out.println(df.format(result));

        double result = calculate(firstNum, operator, secondNum);
        DecimalFormat df =  new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    private static double calculate(int a, String operator, int b) {
        double result = 0.0;

        switch (operator){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;

        }

        return result;
    }
}
