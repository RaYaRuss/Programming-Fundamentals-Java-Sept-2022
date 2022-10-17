package MethodsMoreEx;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();

        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);


        switch (firstLine) {
            case "int":
                int intNum = Integer.parseInt(scanner.nextLine());
                System.out.println(readType(intNum));
                break;
            case "real":
                double dbNum= Double.parseDouble(scanner.nextLine());
                readType(dbNum);
                break;
            case "string":
                String text = scanner.nextLine();
                System.out.println(readType(text));
                break;
            default:
                break;
        }
    }
    public static int readType (int num) {
        int result = num * 2;
        return result;
    }
    public static void readType (double num) {
        double result =  num * 1.5;
        System.out.printf("%.2f", result);
    }
    public static String readType (String text) {
        String newText = "$" + text + "$";
        return newText;
    }
}
