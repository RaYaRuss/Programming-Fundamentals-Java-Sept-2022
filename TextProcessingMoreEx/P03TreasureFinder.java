package TextProcessingMoreEx;

import java.util.Arrays;
import java.util.Scanner;

public class P03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] keyArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray(); ;
        String line = scanner.nextLine();
        StringBuilder message = new StringBuilder();

        while (!line.equals("find")) {
            int keyCount = 0;
            for (int i = 0; i < line.length() ; i++) {
                int current = (int)line.charAt(i);
                    current = line.charAt(i) - keyArr[keyCount];
                    char symbol = (char) current;

                    keyCount++;
                    if (keyCount == keyArr.length) {
                        keyCount = 0;

                    }
                message.append(symbol);
            }

            int anpIndexStart = message.indexOf("&") + 1;
            int anpIndexEnd = message.lastIndexOf("&");
            String type = message.substring(anpIndexStart, anpIndexEnd);

            int coordinatesStart = message.indexOf("<") + 1;
            int coordinatesEnd = message.indexOf(">");
            String coordinates = message.substring(coordinatesStart, coordinatesEnd);

            System.out.printf("Found %s at %s%n", type, coordinates);

            line = scanner.nextLine();
            message.setLength(0);

        }
    }
}
