package MethodsEx;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // брой на редовете=броя на колоните в тази матрица

        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
