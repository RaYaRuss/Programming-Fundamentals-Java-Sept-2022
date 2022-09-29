package DataTypesAndVariables;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int countPersons = Integer.parseInt(scanner.nextLine());
            int capacity = Integer.parseInt(scanner.nextLine());

            int courses = 0;

            if (countPersons / capacity >= 0) {
                courses = countPersons / capacity;
            }
            if (countPersons % capacity != 0) {
                courses += 1;
            }
            System.out.println(courses);
    }
}
