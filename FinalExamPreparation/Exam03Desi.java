package FinalExamPreparation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam03Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(Pattern.quote("|"));
        Map<String, ArrayList<String>> notes = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {

            String[] line = input[i].trim().split(": ");
            if (!notes.containsKey(line[0])) {
                notes.put(line[0], new ArrayList<>());
                notes.get(line[0]).add(line[1]);
            }else {
                notes.get(line[0]).add(line[1]);
            }

        }

        String[] words = scanner.nextLine().split(Pattern.quote(" | "));

        String end = scanner.nextLine();

        if (end.equals("Test")){

            for (String word : words) {
                String clear = word.trim();
                if(notes.containsKey(clear)){
                    System.out.println(clear+":");
                    for (Map.Entry<String, ArrayList<String>> entry : notes.entrySet()){
                        if(entry.getKey().equals(clear)){
                            ArrayList<String> definition = entry.getValue();
                            for (int i = 0; i < definition.size(); i++) {
                                System.out.println(" -" +definition.get(i));
                            }
                        }
                    }
                }
            }

        } else if (end.equals("Hand Over")) {
            for (Map.Entry<String, ArrayList<String>> entry : notes.entrySet()){
                System.out.printf("%s ", entry.getKey());
            }
        }
    }
}
