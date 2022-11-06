package MidExamFundamentals;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> topNumbers = new ArrayList<>();

        double averageValue = 0;
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        averageValue = sum / numbers.size();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > averageValue) {
                topNumbers.add(numbers.get(i));
            }
        }
        if (topNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            Collections.sort(topNumbers);
            Collections.reverse(topNumbers);
            if (topNumbers.size() > 5) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(topNumbers.get(i) + " ");
                }
            } else {
                for (int number : topNumbers) {
                    System.out.print(number + " ");
                }
            }

        }
    }
}