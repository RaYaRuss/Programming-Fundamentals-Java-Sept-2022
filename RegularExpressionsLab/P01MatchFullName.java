package RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex); // шаблон, който проверява по написания регекс

        Matcher matcher = pattern.matcher(text); // текстовете от променливата text, koito mi otgovarqt na шаблона

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");


        }
    }
}
