package RegularExpressionsMoreEx;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // входните данни

        String[] tickets = input.split(",\\s+"); // входни данни  -> в масив от билети


        String regex = "([^@#$^]*)(?<symbols1>[@#$^]{6,10})([^@#$^]*)(?<symbols2>[@#$^]{6,10})";
        Pattern pattern = Pattern.compile(regex);

        boolean noMatch = true;
        for (int i = 0; i < tickets.length; i++) { // итерираме по входните данни / дължината на масива
            String currentTicket = tickets[i];
            if (currentTicket.length() != 20) { // ако дължината на текущия билет е различна от 20 /20 символа/ => невалиден билет
                System.out.println("invalid ticket"); // отпечатваме
                noMatch = false;

            }
            if (currentTicket.length() == 20) { // ако дължината е 20 /има 20 символа

                Matcher matcher = pattern.matcher(currentTicket); // входните данни, отговарящи на шаблона

                if (matcher.find()) { // ако има открити входни данни , които отговарят на шаблона

                    String leftGroup = matcher.group("symbols1"); // специалните символи в лявата част
                    String rightGroup = matcher.group("symbols2"); // специалните символи в дясната част

                    char currentSymbol = leftGroup.charAt(0); // взимаме си специалния символ
                    int countSymbols = leftGroup.length(); // броят символи /за отпечатването/
                    if (leftGroup.equals(rightGroup)) { // ако лявата част е еднаква с дястата /символите/
                        // output.put(currentTicket, countSymbols); // в мапа си записваме билета и броят символи
                        if (countSymbols < 10) { // ако броят е < 10 => отпечатваме
                            System.out.printf("ticket \"%s\" - %d%c%n", currentTicket, countSymbols, currentSymbol);
                            noMatch = false;

                        } else if (countSymbols == 10) { // ско броят е 10 => отпечатваме
                            System.out.printf("ticket \"%s\" - %d%c Jackpot!%n", currentTicket, countSymbols, currentSymbol);
                            noMatch = false;

                        } else {
                            System.out.printf("ticket \"%s\" - no match%n", currentTicket);
                        }
                    }
                }

            }
            if (noMatch) {
                System.out.printf("ticket \"%s\" - no match%n", currentTicket);
            }
        }
    }
}
