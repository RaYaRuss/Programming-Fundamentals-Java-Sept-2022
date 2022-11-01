package ListsMoreEx;

import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstLine = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondLine = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> lastTwoNumbers = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        List<Integer> lastList =  new ArrayList<>();
        int size = Math.min(firstLine.size(), secondLine.size());

        if (firstLine.size() > secondLine.size()) {
            lastTwoNumbers.add(firstLine.get(firstLine.size() - 1));
            lastTwoNumbers.add(firstLine.get(firstLine.size() - 2));
            firstLine.remove(firstLine.size() - 1);
            firstLine.remove(firstLine.size() - 1);
        } else if (secondLine.size() > firstLine.size()) {
            lastTwoNumbers.add(secondLine.get(0));
            lastTwoNumbers.add(secondLine.get(1));
            secondLine.remove(secondLine.get(0));
            secondLine.remove(secondLine.get(0));
        }
        Collections.sort(lastTwoNumbers);
        for (int i = 0; i < size; i++) {
            int firstNum = firstLine.get(i);
            int secondNum = secondLine.get(secondLine.size() - 1 - i);
            resultList.add(firstNum);
            resultList.add(secondNum);
        }
        for (int i = 0; i < resultList.size(); i++) {
            if (resultList.get(i) > lastTwoNumbers.get(0) && resultList.get(i) < lastTwoNumbers.get(1)) {
                lastList.add(resultList.get(i));
            }
        }
        Collections.sort(lastList);
        for (int el : lastList) {
            System.out.print(el + " ");
        }
    }
}

