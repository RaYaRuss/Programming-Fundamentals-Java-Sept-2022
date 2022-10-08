package Arrays.moreEx;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstRowArr = new int[]{1};
        int[] secondRowArr = new int[]{1, 1};
        int[] thirdRowArr = new int []{1, 2, 1};
        System.out.println(firstRowArr[0]);
        for (int element : secondRowArr) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int el : thirdRowArr) {
            System.out.print(el + " ");
        }

        int[] tempArray = thirdRowArr;

        for (int i = 0; i < n; i++) {
            int newArr = tempArray[i];
            for (int j = 0; j <= n; j++) {
            }

        }


            }
        }
