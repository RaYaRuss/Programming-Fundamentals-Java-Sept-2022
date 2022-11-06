package MidExamFundamentals;

import java.util.Scanner;

public class P02FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friendsNames = scanner.nextLine().split(", ");

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("Report")) {
            String[] command = commandLine.split(" ");
            String firstWord = command[0];

            switch (firstWord) {
                case "Blacklist":
                    String name = command[1];
                    for (int i = 0; i < friendsNames.length; i++) {
                        if (friendsNames[i].equals(name)) {
                            friendsNames[i] = "Blacklisted";
                            System.out.printf("%s was blacklisted.%n", name);
                            break;
                        } else {
                            System.out.printf("%s was not found.%n", name);
                            break;
                        }
                    }
                    break;
                case "Error":
                    int errorIndex = Integer.parseInt(command[1]);
                    if (errorIndex >= 0 && errorIndex < friendsNames.length) {
                        if (!friendsNames[errorIndex].equals("Blacklisted") && (!friendsNames[errorIndex].equals("Lost"))) {
                            String currentName = friendsNames[errorIndex];
                            friendsNames[errorIndex] = "Lost";
                            System.out.printf("%s was lost due to an error.%n",currentName);
                            break;
                            }
                        }
                    break;
                case "Change":
                    int changeIndex = Integer.parseInt(command[1]);
                    String newName = command[2];
                    if (changeIndex >= 0 && changeIndex < friendsNames.length) {
                        String currentUsername = friendsNames[changeIndex];
                        friendsNames[changeIndex] = (newName);
                        System.out.printf("%s changed his username to %s.%n", currentUsername, newName);
                        break;
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }
        int countBlack = 0;
        int countLost = 0;
        for (String friendsName : friendsNames) {
            if (friendsName.equals("Blacklisted")) {
                countBlack++;
            } else if (friendsName.equals("Lost")) {
                countLost++;
            }
        }
        System.out.printf("Blacklisted names: %d%n", countBlack);
        System.out.printf("Lost names: %d%n", countLost);
        System.out.println(String.join(" ", friendsNames));
    }
}
