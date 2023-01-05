package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam02MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();
            String regex = "^(\\$|\\%)(?<tag>[A-Z][a-z]{2,})\\1: (\\[(?<gr1>[0-9]+)\\])\\|(\\[(?<gr2>[0-9]+)\\])\\|(\\[(?<gr3>[0-9]+)\\])\\|$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            String output = "";
            boolean noMatch = false;
            while (matcher.find()) {
                noMatch = true;
                int one = Integer.parseInt(matcher.group("gr1"));
                int two = Integer.parseInt(matcher.group("gr2"));
                int three = Integer.parseInt(matcher.group("gr3"));

                char chOne = (char) one;
                char chTwo = (char) two;
                char chThree = (char) three;
                String tag = matcher.group("tag");
                output = output + chOne + chTwo + chThree;
                System.out.printf("%s: %s%n", tag, output);

            }
            if (!noMatch) {
                System.out.println("Valid message not found!");
            }
        }
    }
}
