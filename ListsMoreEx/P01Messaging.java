package ListsMoreEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<String> text = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        String output = "";
        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
                index = getSum(currentNum);
            if (index < text.size()) {
                output += text.get(index);
            } else {
                index = index - text.size();
                output += text.get(index);
            }
            text.remove(index);
        }
            System.out.println(output);
        }

        public static int getSum ( int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            return sum;
        }
    }
