package RegularExpressionsEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race { // изпитна задача
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namesParticipants = scanner.nextLine();
        List<String> names = Arrays.stream(namesParticipants.split(", ")).collect(Collectors.toList());

        Map<String, Integer> racerDistances = new LinkedHashMap<>();
        names.forEach(name -> racerDistances.put(name, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);
        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
           // 1. име на състезателя -> всички букви
            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }
            // 2. дистанция - > сума от цифрите
            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()){
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (names.contains(racerName.toString())) {
                int currentDistance =racerDistances.get(racerName.toString()); // текущата дистанция, избягана от играча
                racerDistances.put(racerName.toString(), currentDistance + distance);

            }

            input = scanner.nextLine();
        }
        List<String> top3racers = racerDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + top3racers.get(0));
        System.out.println("2nd place: " + top3racers.get(1));
        System.out.println("3rd place: " + top3racers.get(2));

//        int count = 1;
//        for (Map.Entry<String, Integer> pair : racerDistances.entrySet()) {
//            if (count ==  1) {
//                System.out.println("1st place: " + pair.getKey());
//                count++;
//            } else if (count == 2) {
//                System.out.println("2nd place: " + pair.getKey());
//                count++;
//            } else if (count == 3) {
//                System.out.println("3rd place: " + pair.getKey());
//                break;
//            }
//        }

    }
}
