package MethodsMoreEx;

import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        double result1 = lineLength(x1, y1, x2, y2);
        double result2 = lineLength(x3, y3, x4, y4);

        if (result1 >= result2) {
            if (closerPoint(x1, y1, x2, y2)){
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
            }

        } else {
            if (closerPoint(x3, y3, x4, y4)){
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3);
            }

        }
        }


    public static double lineLength(double x1, double y1, double x2, double y2) {
        double line = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return line;
    }

    public static boolean closerPoint (int x1, int y1, int x2, int y2) {
        double c1 = Math.sqrt((x1 * x1) + (y1 * y1));
        double c2 = Math.sqrt((x2 * x2) + (y2 * y2));
        boolean closer = true;
        if (c1 <= c2) {
            closer = true;
        } else {
            closer = false;

        }
        return closer;
    }
}