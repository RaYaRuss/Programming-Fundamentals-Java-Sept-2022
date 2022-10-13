package MethodsEx;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        printMiddleCharacter(textInput);

    }

    public static void printMiddleCharacter (String text) {
        char [] chars = new char[text.length()];
        char middleChar = ' ';
        char middleChar1 = ' ';
        char currentSymbol = ' ';

        for (int i = 0; i < chars.length; i++) {
            chars[i] = text.charAt(i);

        }
            if (chars.length % 2 == 0) {
                middleChar1 = chars[chars.length / 2];
                middleChar = chars[(chars.length / 2) -1];
                System.out.println(middleChar + "" + middleChar1);
            } else {
                middleChar = chars[chars.length / 2];
                System.out.println(middleChar);
            }
        }

        }
