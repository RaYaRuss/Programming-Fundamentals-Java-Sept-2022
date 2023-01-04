package TextProcessingEx;

import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] firstLineNum = scanner.nextLine().toCharArray();
        int multiplier = Integer.parseInt(scanner.nextLine());

        StringBuilder product = new StringBuilder();

        int addNum = 0;
        for (int i = firstLineNum.length - 1; i >= 0; i--) {
            int currentNum = ((firstLineNum[i] - '0') * multiplier) + addNum;
            product.append(currentNum % 10);
            addNum = currentNum / 10;
        }

        product.append(addNum);

        product.reverse();
        while (product.charAt(0) == '0' && product.length() > 1) {
            product.deleteCharAt(0);
        }
        System.out.println(product);

    }
}
