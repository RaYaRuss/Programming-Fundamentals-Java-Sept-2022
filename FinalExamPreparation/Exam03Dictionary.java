package FinalExamPreparation;

import java.util.*;
import java.util.regex.Pattern;

public class Exam03Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, ArrayList<String>> wordsDefinitionsMap = new LinkedHashMap<>();

        String[] definitionsArr = input.split(Pattern.quote("|"));
        for (int i = 0; i < definitionsArr.length; i++) {
            String word = definitionsArr[i].trim().split(": ")[0];
            String wordDefinition = definitionsArr[i].trim().split(": ")[1];

            if (!wordsDefinitionsMap.containsKey(word)) {
                wordsDefinitionsMap.put(word, new ArrayList<>());
                wordsDefinitionsMap.get(word).add(wordDefinition);
            } else {
                wordsDefinitionsMap.get(word).add(wordDefinition);
            }
        }
        String words = scanner.nextLine();
        String [] wordsArr = words.split(Pattern.quote(" | "));
        String command = scanner.nextLine();

        if (command.equals("Test")) {

            for (String word : wordsArr) {
                String clear = word.trim();
                if (wordsDefinitionsMap.containsKey(clear)) {
                    System.out.println(clear + ":");
                for (Map.Entry<String, ArrayList<String>> entry : wordsDefinitionsMap.entrySet()){
                if (entry.getKey().equals(clear)) {
                    ArrayList<String> definition = entry.getValue();
                    for (int i = 0; i < definition.size(); i++) {
                        System.out.println(" -" + definition.get(i));
                    }
                }
                }
                }
            }
        } else if (command.equals("Hand Over")) {
            for (Map.Entry<String, ArrayList<String>> entry : wordsDefinitionsMap.entrySet()) {
                System.out.printf("%s ", entry.getKey());
            }
        }
    }
}
