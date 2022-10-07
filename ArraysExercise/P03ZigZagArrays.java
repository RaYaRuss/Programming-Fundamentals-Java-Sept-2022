package Arrays.exercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int rows = Integer.parseInt(scanner.nextLine());
         String[] firstArray = new String[rows];
         String[] secondArray = new String[rows];

        for (int row = 1; row <= rows; row++) {
            //"1, 5". split(" ) -> ["1", "5"]
            String[] numbers = scanner.nextLine().split(" "); // ["1", "5"]
            String firstNum = numbers[0];
            String secondNum = numbers[1];

            if (row % 2 == 0) {
                //firstNumber goes to secondArray;
                secondArray[row - 1] = firstNum;
                // secondNum goes to firstArray
                firstArray[row - 1] = secondNum;
            } else {
                //firstNum goes to firstArray
                firstArray[row - 1] = firstNum;
                //secondNum goes to secondArray
                secondArray[row - 1] = secondNum;
            }
        }
        //отпечатваме масив от текстове -  варианти:
        //1. for  по index
        //2. foreach по елементите
        //3. String.join !!! само за масив от текстове!!!

        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
