package RegularExpressionsMoreEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String [] inputArr = input.split("\\|");
        String firstPart = inputArr[0];
        String secondPart = inputArr[1];
        String thirdPart = inputArr[2];

        String letterRegex = "((.+)([\\#,$,\\%,\\*,\\&])(?<capital>[A-Z]+)\\3)";
        String asciiLengthRegex = "(?<asciiCode>\\d+):(?<length>\\d{2})";

        Pattern patternLetter = Pattern.compile(letterRegex);
        Pattern patternAsciiLength = Pattern.compile(asciiLengthRegex);

        StringBuilder letters = new StringBuilder();

        Matcher matcherLetter = patternLetter.matcher(firstPart);
        Map<Integer, Integer> asciiLength = new LinkedHashMap<>();

        while (matcherLetter.find()) {
            String capitalLetters = matcherLetter.group("capital");
            letters.append(capitalLetters);

            Matcher matcherAscii = patternAsciiLength.matcher(secondPart);


            while (matcherAscii.find()) {
                // sdsGGasAOTPWEEEdas$AOTP$|a65:1.2s65:03d79:01ds84:02! -80:07++ABs90:1.1|adsaArmyd Gara So La Arm Armyw21 Argo O daOfa Or Ti Sar saTheww The Parahaos
                int asciiCode = Integer.parseInt(matcherAscii.group("asciiCode"));
                int length = Integer.parseInt(matcherAscii.group("length"));
                asciiLength.put(asciiCode, length);

                String foundWord = getWords(thirdPart, letters, asciiCode, length, asciiLength);
                System.out.println(foundWord);

            }

        }
    }
    private static String getWords(String words,StringBuilder letters, int asciiCode, int length, Map<Integer, Integer> asciiLength) {
        int count = 0;

        char[] currentLetter = letters.substring(count, count + 1).toCharArray();
        String [] wordsArr = words.split("\\s+");
        String wordFound ="";
        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];
            if (currentLetter[count] == (currentWord.charAt(0))) {
                for (int j = 0; i < asciiLength.size(); i++) {
                    if ((int) currentWord.charAt(0) == asciiCode && currentWord.length() == length + 1) {
                        wordFound = currentWord;
                        count++;
                    }
                }
            }
        }
        return wordFound;
    }
}
