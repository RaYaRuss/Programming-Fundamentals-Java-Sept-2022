package MidExamFundamentals;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class P03DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cardsList =
                Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int number = Integer.parseInt(scanner.nextLine());

        String commandLine = scanner.nextLine();
        boolean noMoreCommands = false;

        while ( number >= 0 ) {
            if (number == 0) {
                noMoreCommands = true;
                break;
            }
            String[] commands = commandLine.split(", ");
            String firstWord = commands[0];

            switch (firstWord) {
                case "Add":
                    String cardName = commands[1];
                    if (cardsList.contains(cardName)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cardsList.add(cardName);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    String cardToRem = commands[1];
                    if (cardsList.contains(cardToRem)) {
                        cardsList.remove(cardToRem);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int removeIndex = Integer.parseInt(commands[1]);
                    if (removeIndex >= 0 && removeIndex < cardsList.size()) {
                        cardsList.remove(removeIndex);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int insertIndex = Integer.parseInt(commands[1]);
                    String cardNameToInsert = commands[2];
                    if (insertIndex >= 0 && insertIndex < cardsList.size()) {
                        if (cardsList.contains(cardNameToInsert)) {
                            System.out.println("Card is already added");
                        } else {
                            cardsList.add(insertIndex, cardNameToInsert);
                            System.out.println("Card successfully added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
            number--;
            if (number == 0){
                noMoreCommands = true;
                break;
            }
            commandLine = scanner.nextLine();
        }
        if (noMoreCommands) {
            System.out.println(String.join(", ", cardsList));
        }
    }
}
