package RegularExpressionsMoreEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regexLetters = "(?<symbols>[\\D]+)(?<digits>\\d+)";

        Pattern patternLetters = Pattern.compile(regexLetters);
        Matcher matcherLetters = patternLetters.matcher(input);
        StringBuilder output = new StringBuilder();

        while (matcherLetters.find()) {
            String symbols = matcherLetters.group("symbols");
            int digits = Integer.parseInt(matcherLetters.group("digits"));


            StringBuilder newSymbols = new StringBuilder();

            for (int i = 1; i <= digits; i++) {
                newSymbols.append(symbols.toUpperCase());

            }
            output.append(newSymbols);
        }
        int count = getUniqueSymbolsCount(input);
        System.out.println("Unique symbols used: " + count);
        System.out.print(output.toString());
    }
    private static int getUniqueSymbolsCount(String input) {
        int count = 0;
        String inputUppercase = input.toUpperCase();
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = inputUppercase.charAt(i);
            if (!Character.isDigit(currentSymbol)) {
                if (!characters.contains(currentSymbol)) {
                    characters.add(currentSymbol);
                }
            }
            count = characters.size();
        }
        return count;
    }
}