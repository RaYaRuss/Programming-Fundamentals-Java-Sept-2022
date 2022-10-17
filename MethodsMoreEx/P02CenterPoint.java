package MethodsMoreEx;

import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printClosestPoint(x1,y1,x2,y2);
    }
    public static void printClosestPoint (int x1, int y1, int x2, int y2) {
        double c1 = Math.sqrt((x1 * x1) + (y1 * y1));
        double c2 = Math.sqrt((x2 * x2) + (y2 * y2));
        if (c1 <= c2) {
            System.out.println("(" +x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" +x2 + ", " + y2 + ")");
        }
    }
}
