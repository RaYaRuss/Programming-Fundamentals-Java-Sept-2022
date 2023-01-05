package TextProcessingMoreEx;

import java.util.Scanner;

public class P04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] englishLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
                "Y", "Z"};

        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] array = scanner.nextLine().split(" ");
        StringBuilder resultText = new StringBuilder();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < morseCode.length; j++) {

                if ( array[i].equals("|")) {
                    resultText.append(' ');
                    break;
                }
                if (array[i].equals(morseCode[j])) {

                    resultText.append((char) (j + 'A'));
                    break;
                }
            }
        }
        System.out.println(resultText);
    }
}
