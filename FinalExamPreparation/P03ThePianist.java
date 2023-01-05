package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        Map<String, String > pieceComposer = new LinkedHashMap<>();
        Map<String, String > pieceKey = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfPieces; i++) {
            String pieces = scanner.nextLine();
            String pieceName = pieces.split("\\|")[0];
            String composer = pieces.split("\\|")[1];
            String key = pieces.split("\\|")[2];

            pieceComposer.put(pieceName, composer);
            pieceKey.put(pieceName, key);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String [] commandArr = command.split("\\|");
            String action = commandArr[0];
            String name = commandArr[1];

            switch (action) {
                case "Add":
                    String composer = commandArr[2];
                    String key = commandArr[3];
                    if (!pieceComposer.containsKey(name)) {
                        pieceComposer.put(name, composer);
                        pieceKey.put(name, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", name, composer, key);

                    } else {
                        System.out.printf("%s is already in the collection!%n", name);
                    }
                    break;
                case "Remove":
                    if (pieceComposer.containsKey(name)) {
                        pieceComposer.remove(name);
                        pieceKey.remove(name);
                        System.out.printf("Successfully removed %s!%n", name);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", name);
                    }
                    break;
                case "ChangeKey":
                    String newKey = commandArr[2];
                    if (pieceKey.containsKey(name)) {
                        pieceKey.put(name, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", name, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", name);
                    }
                    break;
            }
            command = scanner.nextLine();

        }
        for (Map.Entry<String, String> entry : pieceComposer.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(),entry.getValue(), pieceKey.get(entry.getKey()));
        }
    }
}
