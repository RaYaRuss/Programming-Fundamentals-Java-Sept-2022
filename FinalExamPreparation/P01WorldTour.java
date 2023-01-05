package FinalExamPreparation;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder outputLine = new StringBuilder(stops);


        String commands = scanner.nextLine();

        while (!commands.equals("Travel")) {
            String [] commandLine = commands.split(":");
            String command = commandLine[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandLine[1]);
                    String stringToAdd = commandLine[2];
                    if (index >= 0 && index <= outputLine.length() - 1) {
                        outputLine.insert(index, stringToAdd);
                    }
                        System.out.println(outputLine.toString());

                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int endIndex = Integer.parseInt(commandLine[2]);

                    if ((startIndex >= 0 && startIndex < outputLine.length()) &&
                    (endIndex >= 0 && endIndex <= outputLine.length() - 1)) {
                        outputLine.replace(startIndex, endIndex + 1, "");
                    }
                        System.out.println(outputLine.toString());

                    break;

                case "Switch":
                    String oldString = commandLine[1];
                    String newString = commandLine[2];

                    if (outputLine.toString().contains(oldString) && !oldString.equals(newString)) {
                        int indexToStart = outputLine.indexOf(oldString);
                        int indexToEnd = indexToStart + oldString.length() - 1;
                        outputLine.replace(indexToStart, indexToEnd + 1, newString);
                    }
                        System.out.println(outputLine.toString());
                    break;
            }

            commands = scanner.nextLine();

        }
        System.out.printf("Ready for world tour! Planned stops: %s", outputLine.toString());
    }
}
