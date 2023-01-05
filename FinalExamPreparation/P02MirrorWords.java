package FinalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(@|#)(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> mirrorWords = new ArrayList<>();

        int countValidPairs = 0;
        while (matcher.find()) {
            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");

            countValidPairs++;

            String reversedWord2 = "";
            for (int i = word2.length() - 1; i >= 0; i--) {
                char current = word2.toCharArray()[i];
                reversedWord2 += current;
            }
            if (word1.equals(reversedWord2)) {
                mirrorWords.add(word1 + " <=> " + word2);
            }
        }

        if (countValidPairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", countValidPairs);
        }
        if (mirrorWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", " , mirrorWords));
            }

        }
    }
