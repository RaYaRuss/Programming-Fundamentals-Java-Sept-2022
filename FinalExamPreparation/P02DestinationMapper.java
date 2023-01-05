package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(=|\\/)(?<town>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();

        while (matcher.find()) {
            String town = matcher.group("town");

            destinations.add(town);

        }

        int count = 0;
        for (String town : destinations) {
             count += town.length();
        }

        System.out.print("Destinations: ");
        System.out.print(String.join(", " , destinations));
        System.out.println();
        System.out.printf("");
        System.out.printf("Travel Points: %d", count);

//        System.out.print("Destinations: ");
//        for (int i = 0; i <= destinations.size() - 1; i++) {
//            if (i == destinations.size() - 1) {
//                System.out.print(destinations.get(i));
//            } else {
//                System.out.print(destinations.get(i) + ", ");
//
//
//            }
//        }
//        System.out.println();
//            System.out.printf("Travel Points: %d", count);

        }
    }
