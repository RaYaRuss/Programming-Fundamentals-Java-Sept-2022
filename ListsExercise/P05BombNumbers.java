package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int [] numAndPower = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int specialNum = numAndPower[0];
        int power = numAndPower[1];
        int sum = 0;

        while (sequence.contains(specialNum)) {
            int specialNumIndex = sequence.indexOf(specialNum);

            int left = Math.max(0, specialNumIndex - power);
            int right = Math.min(specialNumIndex + power, sequence.size() - 1);

            for (int i = right; i >= left; i--) {
                sequence.remove(i);
            }
        }
        System.out.println(sequence.stream().mapToInt(Integer::intValue).sum());
            }
        }

