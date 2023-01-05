package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(::|\\*\\*)(?<emoji>)[A-Z][a-z]{2,}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> coolEmojis = new ArrayList<>();

        int coolThreshold = 1;
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                coolThreshold = coolThreshold * Integer.parseInt(currentSymbol + "");
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);

        int counterEmojis = 0;
        while (matcher.find()) {
            counterEmojis++;
            String emoji = matcher.group();
            int sum = 0;
            for (int i = 2; i <= emoji.length() - 3; i++) {
                char current = emoji.charAt(i);
                sum = sum + current;
            }
            if (sum > coolThreshold) {
                coolEmojis.add(emoji);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", counterEmojis);
        for (String emoji : coolEmojis) {
            System.out.println(emoji);
        }
    }
}
