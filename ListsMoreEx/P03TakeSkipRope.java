package ListsMoreEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<Character> chars = new ArrayList<>();
        List<Integer> numberList = new ArrayList<>();
        List<Character> nonNumbersList =  new ArrayList<>();

        for (char ch : text.toCharArray()) {
            chars.add(ch);
        }
        for (int i = 0; i < chars.size(); i++) {
            char currentChar = chars.get(i);
            if (Character.isDigit(currentChar)) {
                int currentNum = currentChar - '0';
                numberList.add(currentNum);
            }
        }
        for (int i = 0; i < chars.size(); i++) {
            char currentChar = chars.get(i);
            if (!Character.isDigit(currentChar)) {
                nonNumbersList.add(currentChar);
            }
        }
            List<Integer> takeList = new ArrayList<>();
            List<Integer> skipList = new ArrayList<>();
            for (int i = 0; i < numberList.size(); i++) {
                if (i % 2 == 0) {
                    takeList.add(numberList.get(i));
                } else if (i % 2 != 0) {
                    skipList.add(numberList.get(i));
                }
            }
            String result = "";
            int index = 0;

        for (int i = 0; i < takeList.size(); i++) {
            int take = takeList.get(i);
            int skip = skipList.get(i);

            if (index + take > nonNumbersList.size()) {
                take = nonNumbersList.size() - index;
            }
            for (int j = 0; j < take; j++) {
                result += nonNumbersList.get(index + j);
            }
            index += take + skip;
        }
            System.out.println(result);

        }
    }


