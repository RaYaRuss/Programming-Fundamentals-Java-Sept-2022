package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        //повторение: въвеждаме индекс
        // стоп: списъкът е празен, size <= 0
        // продължаваме: списъкът е пълен -> size > 0

        int sumRemoved = 0; // сума на премахнатите елементи
        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            // 1. индексът е в списъка, когато е > 0 и е <= последния
            if (index >= 0 && index <= numbers.size() - 1) {
                //1. взимам елемента на дадения индекс
                int removeElement = numbers.get(index);
                //2. премахвам елемента от този индекс -> и сумирам
                sumRemoved += removeElement;
                numbers.remove(index);
                // 3. трябва да си модифицирам списъка спрямо индекса
                modifyList(numbers, removeElement);
            }
            // 2. индексът е < 0
            else if (index < 0) {
                // 1. взимаме 1вия елемент от списъка
                int firstElement = numbers.get(0);
                //2. премахвам първия елемент от списъка; & sum
                sumRemoved += firstElement;
                numbers.remove(0);
                // 3. взимаме последния елемент ор списъка
                int lastElement = numbers.get(numbers.size() -1);
                //4. слагаме на индекс последния елемент

                numbers.add(0, lastElement);
                // 5. модифирицам списъка
                modifyList(numbers, firstElement);

            }
            // 3. индексът е > от последния в списъка
            else if (index > numbers.size() - 1) {
                // 1. взимаме последния елемент
                int lastElement = numbers.get(numbers.size() - 1);
                //2. премахваме последния елемент & sum
                sumRemoved += lastElement;
                numbers.remove(numbers.size() - 1);
                //3. взимаме първия елемент
                int firstElement = numbers.get(0);
                //4. слагаме първия елемент на мястото на индекса
                numbers.add(firstElement);
                //5. модифицирам списъка-> премахнатия елемент е последния елемент
                modifyList(numbers, lastElement);
            }
        }
        System.out.println(sumRemoved);
    }

    private static void modifyList(List<Integer> numbers, int removeElement) {
        for (int indexInList = 0; indexInList <= numbers.size() - 1; indexInList++) {
           int currentNumber = numbers.get(indexInList);
           if (currentNumber <= removeElement) {
               currentNumber += removeElement;
           } else {
               currentNumber -= removeElement;
           }
           numbers.set(indexInList, currentNumber); // set замества число на дадения индекс

        }
    }
}
