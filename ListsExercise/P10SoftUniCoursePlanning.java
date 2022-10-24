package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String [] command = input.split(":");
            if (command[0].equals("Add")) {
                String addLessonTitle = command[1];
                if (!schedule.contains(addLessonTitle)) {
                    schedule.add(addLessonTitle);
                }

            } else if (command[0].equals("Insert")) {
                String insertLessonTitle = command[1];
                int indexInsert = Integer.parseInt(command[2]);
                if (!schedule.contains(insertLessonTitle)){
                    schedule.add(indexInsert, insertLessonTitle);
                }

            } else if (command[0].equals("Remove")) {
                String removeLessonTitle = command[1];
                if (schedule.contains(removeLessonTitle)){
                    schedule.remove(removeLessonTitle);
                }
                if (schedule.contains(removeLessonTitle +"-Exercise")){
                    schedule.remove(removeLessonTitle + "-Exercise");
                }

            } else if (command[0].equals("Swap")) {
                String swapTitle1 = command[1];
                String swapTitle2 = command[2];
                if (schedule.contains(swapTitle1) && schedule.contains(swapTitle2)) {
                    int index1 = schedule.indexOf(swapTitle1);
                    int index2 = schedule.indexOf(swapTitle2);
                    schedule.set(index1, swapTitle2);
                    schedule.set(index2, swapTitle1);
                    if (schedule.contains(swapTitle1 + "-Exercise")) {
                        schedule.remove(swapTitle1 + "-Exercise");
                        schedule.add(index2 + 1, swapTitle1 + "-Exercise");
                    }
                    if (schedule.contains(swapTitle2 + "-Exercise")) {
                        schedule.remove(swapTitle2 + "-Exercise");
                        schedule.add(index1 + 1, swapTitle2 + "-Exercise");

                    }
                }
            } else if (command[0].equals("Exercise")) {
                String lessonTitleExercise = command[1];
                if (schedule.contains(lessonTitleExercise + "-Exercise")){
                    continue;
                } else if (schedule.contains(lessonTitleExercise) && !schedule.contains(lessonTitleExercise + "-Exercise")) {
                    int lessonIndex = schedule.indexOf(lessonTitleExercise);
                    schedule.add(lessonIndex + 1,lessonTitleExercise + "-Exercise");

                } else if (!schedule.contains(lessonTitleExercise)){
                    schedule.add(lessonTitleExercise);
                    schedule.add(lessonTitleExercise + "-Exercise");
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < schedule.size(); i++) {
            System.out.println(i + 1 + "." + schedule.get(i));
        }

    }
}
