package MidExamFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int peopleInLift = 0;
        int liftCapacity = wagons.length * 4;
        boolean liftIsFull = false;
        boolean noMoreWaitingPeople = false;
        int initialCountPeople = peopleWaiting;

        for (int i = 0; i < wagons.length; i++) {
            while (wagons[i] <= 4 && peopleWaiting > 0) {
                wagons[i]++;
                peopleInLift++;
                peopleWaiting--;
                if (wagons[i] == 4) {
                    i++;
                    if (i == wagons.length) {
                        liftIsFull = true;
                        break;
                    }
                }
            }

            if (peopleWaiting == 0) {
                noMoreWaitingPeople = true;
                break;
            }
        }
        if (noMoreWaitingPeople && !liftIsFull)  {
            int emptySpots = liftCapacity - peopleInLift;
            System.out.printf("The lift has empty spots!%n");
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
        } else if (liftIsFull && !noMoreWaitingPeople) {
            int people = initialCountPeople - peopleInLift;
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }

        } else {
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }

        }
    }
}
/*  using System;
using System.Linq;

namespace _2.TheLift
{
    class Program
    {
        static void Main(string[] args)
        {
            int peopleWaitingForLyft = int.Parse(Console.ReadLine());
            int[] wagon = Console.ReadLine().Split().Select(int.Parse).ToArray();
            int peopleOnTheCurrentWagon = 0;
            int peopleonTheLyft = 0;
            bool NoMorePeople = false;

            for (int i = 0; i < wagon.Length; i++)
            {
                while (wagon[i] < 4)
                {
                    wagon[i]++;
                    peopleOnTheCurrentWagon++;
                    if (peopleonTheLyft + peopleOnTheCurrentWagon == peopleWaitingForLyft)
                    {
                        NoMorePeople = true;
                        break;
                    }
                }
                peopleonTheLyft += peopleOnTheCurrentWagon;
                if (NoMorePeople)
                {
                    break;
                }
                peopleOnTheCurrentWagon = 0;
            }

            if (peopleWaitingForLyft > peopleonTheLyft)
            {
                Console.WriteLine($"There isn't enough space! {peopleWaitingForLyft - peopleonTheLyft} people in a queue!");
                Console.WriteLine(string.Join(" ", wagon));
            }
            else if (peopleWaitingForLyft < wagon.Length * 4 && wagon.Any(w => w < 4))
            {
                Console.WriteLine("The lift has empty spots!");
                Console.WriteLine(string.Join(" ", wagon));
            }
            else if (wagon.All(w => w == 4) && NoMorePeople == true)
            {
                Console.WriteLine(string.Join(" ", wagon));
            }
        }
    }
}


 */