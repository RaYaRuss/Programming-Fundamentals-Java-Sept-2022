package TextProcessingEx;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalSum = 0;
        String[] inputData = input.split(" ");
        String firstWord = inputData[0];
        String secondWord = inputData[1];

        totalSum = getTotalSum(totalSum, firstWord, secondWord);
        System.out.println(totalSum);
    }

    private static int getTotalSum(int totalSum, String firstWord, String secondWord) {
        int secondWordLength = secondWord.length();
        int firstWordLength = firstWord.length();

        if (firstWordLength > secondWordLength) {
            String newFirstWord = firstWord.substring(0, secondWordLength);
        int diff = firstWordLength - secondWordLength;
        String remainingFirstWord = firstWord.substring(firstWordLength - diff);

            for (int i = 0; i < newFirstWord.length(); i++) {
                totalSum += newFirstWord.charAt(i) * secondWord.charAt(i);
            }
            for (char symbol : remainingFirstWord.toCharArray()) {
                totalSum += symbol;
            }
        } else if (secondWordLength > firstWordLength) {
            String newSecondWord = secondWord.substring(0, firstWordLength);
            int diff = secondWordLength - firstWordLength;
            String remainingSecondWord = secondWord.substring(secondWordLength - diff);

            for (int i = 0; i < firstWordLength; i++) {
                totalSum += newSecondWord.charAt(i) * firstWord.charAt(i);
            }
            for (char symbol : remainingSecondWord.toCharArray()) {
                totalSum += symbol;
            }

        } else if (firstWordLength == secondWordLength) {
            for (int i = 0; i < firstWordLength; i++) {
                totalSum += firstWord.charAt(i) * secondWord.charAt(i);
            }

        }
        return totalSum;

    }
}
