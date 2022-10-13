package MethodsEx;

import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни -> текст
        String text = scanner.nextLine();

        printVowelsCount(text.toLowerCase());

    }
    // метод, който принтира броят на гласните букви;
    public static void printVowelsCount(String text) {
        // да обходим текста и да преброим гласните букви
        // приемаме,че текстът е изцяло с малко букви
        int count = 0; // броим гласните букви
        for (char symbol : text.toCharArray()) { // получаваме масив от симвили и можем да си го обходим с foreach
            // проверяваме за глсна буква -> a, e, i, o , u
            if (symbol == 'a' || symbol == 'e' || symbol == 'o' || symbol == 'u' || symbol == 'i') {
                count++;
            }
        }
        System.out.println(count);
    }
}
