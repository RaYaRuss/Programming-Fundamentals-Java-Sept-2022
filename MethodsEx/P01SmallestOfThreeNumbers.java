package MethodsEx;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(num1, num2, num3);
    }
    // да напишем метод, който отпечетва най-малкото от 3 цели числа;
    public static void printSmallestNumber(int n1, int n2, int n3) {
        // 1-вото число да е най-малкото
        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1);
            // 2рото да е най-малкото число
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
            // 3тото да е най-малкото
        } else if (n3 <= n1 && n3 <= n2){
            System.out.println(n3);
        }
    }
}
