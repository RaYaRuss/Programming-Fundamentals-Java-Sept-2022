package Arrays.moreEx;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines =  Integer.parseInt(scanner.nextLine());
        int [] sumNum = new int [numberOfLines];

        int sum = 0;
        for (int i = 0; i < numberOfLines ; i++) {
            char[] letters = scanner.next().toCharArray();
            for (char let : letters) {
                if (let == 'a' || let == 'A' || let == 'e' || let == 'E' || let == 'o' ||
                let == 'O' || let == 'u' || let == 'U' || let == 'i' || let == 'I') {
                    sum += let * letters.length;
                } else {
                    sum += let / letters.length;
                }
            }
            sumNum [i] = sum;
            sum = 0;
        }
        Arrays.sort(sumNum);
        for (int element : sumNum) {
            System.out.println(element);

        }
        }
}

